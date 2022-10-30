package bgd.mapper;

import bgd.dto.UserDTO;
import bgd.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends AbstractMapper<User, UserDTO>{
    @Override
    public UserDTO mapObjectToDto(User user) {
        if (user == null) return null;

        UserDTO.UserDTOBuilder userDtoBuilder = UserDTO.builder();
        userDtoBuilder.id(user.getId());
        userDtoBuilder.surname(user.getSurname());
        userDtoBuilder.name(user.getName());
        userDtoBuilder.email(user.getEmail());
        userDtoBuilder.securityLogin(user.getSecurityLogin());

        return userDtoBuilder.build();
    }
}