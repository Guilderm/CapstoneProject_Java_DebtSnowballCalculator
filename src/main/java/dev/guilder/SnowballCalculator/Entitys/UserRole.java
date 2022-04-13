
package dev.guilder.SnowballCalculator.Entitys;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "UserRole")
public class UserRole implements Serializable{
    private static final long serialVersionUID= 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long userRolId;
    private String roleName;
    private String rolePermissions;
    private boolean roleStatus;

    public long getUserRolId() {
        return userRolId;
    }

    public void setUserRolId(long userRolId) {
        this.userRolId = userRolId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRolePermissions() {
        return rolePermissions;
    }

    public void setRolePermissions(String rolePermissions) {
        this.rolePermissions = rolePermissions;
    }

    public boolean isRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(boolean roleStatus) {
        this.roleStatus = roleStatus;
    }
    
    public List<String> getRoleList() {
        if (this.roleName.length() > 0) {
            return Arrays.asList(this.roleName.split(","));
        }
        return new ArrayList<>();
    }

    public List<String> getPermissionList() {
        if (this.rolePermissions.length() > 0) {
            return Arrays.asList(this.rolePermissions.split(","));
        }
        return new ArrayList<>();
    }
}
