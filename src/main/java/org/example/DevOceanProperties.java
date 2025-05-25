package org.example;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "devocean")
public class DevOceanProperties {
    private String groupName;
    private int memberCount;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    @Override
    public String toString() {
        return "DevOcean{" +
                "groupName='" + groupName + '\'' +
                ", memberCount=" + memberCount +
                '}';
    }
}