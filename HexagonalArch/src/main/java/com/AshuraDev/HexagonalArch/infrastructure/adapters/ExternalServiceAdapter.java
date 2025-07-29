package com.AshuraDev.HexagonalArch.infrastructure.adapters;

import com.AshuraDev.HexagonalArch.domain.models.AdditionalTaskInfo;
import com.AshuraDev.HexagonalArch.domain.ports.out.ExternalServicePort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ExternalServiceAdapter implements ExternalServicePort {
    //https://jsonplaceholder.typicode.com/todos
    //https://jsonplaceholder.typicode.com/users

    private final RestTemplate restTemplate;

    public ExternalServiceAdapter() {
         restTemplate = new RestTemplate();
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long taskId) {
        String apiUrl = "https://jsonplaceholder.typicode.com/todos" + taskId;
        ResponseEntity<JsonPlaceHolderTodo> response = restTemplate.getForEntity(apiUrl, JsonPlaceHolderTodo.class);
        JsonPlaceHolderTodo todo = response.getBody();

        if (todo == null) {
            return null;
        }
        apiUrl = "https://jsonplaceholder.typicode.com/todos" + todo.getUserId();
        ResponseEntity<JsonPlaceholderUser> userResponse = restTemplate.getForEntity(apiUrl,JsonPlaceholderUser.class);
        JsonPlaceholderUser user  = userResponse.getBody();

        if (user == null) {
        return null;
        }
        return new AdditionalTaskInfo(user.getEmail(),user.getName(),user.getId());
    }
    private static class JsonPlaceHolderTodo{
        private long id;
        private long userId;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }
    }
    private static class JsonPlaceholderUser{
        private long id;
        private String name;
        private String email;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
