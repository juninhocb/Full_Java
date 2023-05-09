package ios;


import java.io.Serializable;

public class Information implements Serializable {
    private static final long serialVersionUID = 1L; //can get properly using serialver
    private transient String internalCode;
    private String serverName;
    private String serverIp;
    private int portNo;
    private boolean isAllow;

    public Information(String ic, String sn, String sip, int pNo, boolean allow){
        this.internalCode = ic;
        this.serverName = sn;
        this.serverIp = sip;
        this.portNo = pNo;
        this.isAllow = allow;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public int getPortNo() {
        return portNo;
    }

    public void setPortNo(int portNo) {
        this.portNo = portNo;
    }

    public boolean isAllow() {
        return isAllow;
    }

    public void setAllow(boolean allow) {
        isAllow = allow;
    }

    @Override
    public String toString() {
        return "Information{" +
                "internalCode='" + internalCode + '\'' +
                ", serverName='" + serverName + '\'' +
                ", serverIp='" + serverIp + '\'' +
                ", portNo=" + portNo +
                ", isAllow=" + isAllow +
                '}';
    }
}
