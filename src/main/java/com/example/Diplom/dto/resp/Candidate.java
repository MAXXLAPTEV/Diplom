package com.example.Diplom.dto.resp;

public class Candidate {


     public Candidate

             (int id, String CandidateName, String CandidateSurname, String Email, String password)
     {
      this.id = id;
      this.CandidateName = CandidateName;
      this.CandidateSurname = CandidateSurname;
      this.Email = Email;
      this.password = password;
    }

    public Candidate() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCandidateName() {
        return CandidateName;
    }

    public void setCandidateName(String candidateName) {
        CandidateName = candidateName;
    }

    public String getCandidateSurname() {
        return CandidateSurname;
    }

    public void setCandidateSurname(String candidateSurname) {
        CandidateSurname = candidateSurname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private int id;
    private String CandidateName;
    private String CandidateSurname;
    private String Email;
    private String password;

}