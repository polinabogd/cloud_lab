package bgd.mapper;

import bgd.dto.SecurityDTO;
import bgd.domain.Security;
import org.springframework.stereotype.Component;

@Component
public class SecurityMapper extends AbstractMapper<Security, SecurityDTO>{
    @Override
    public SecurityDTO mapObjectToDto(Security security) {
        if (security == null) return null;

        SecurityDTO.SecurityDTOBuilder securityDTOBuilder = SecurityDTO.builder();
        securityDTOBuilder.login(security.getLogin());
        securityDTOBuilder.password(security.getPassword());

        return securityDTOBuilder.build();
    }
}