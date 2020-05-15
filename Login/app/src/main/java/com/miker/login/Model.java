package com.miker.login;

import com.miker.login.carrera.Carrera;
import com.miker.login.curso.Ciclo;
import com.miker.login.curso.Curso;

import java.util.ArrayList;

/**
 * Created by HsingPC on 20/4/2018.
 */

public class Model {
    private String apiUrl = "http://10.0.2.2:56884/BackEnd/ServeletUser";
    private ArrayList<User> users;
    private User loggedUser;
    private ArrayList<Curso> cursos;
    private ArrayList<Carrera> carreras;
    private int[] covers;

    public Model(ArrayList<User> users, User loggedUser, ArrayList<Curso> cursos, ArrayList<Carrera> carreras, int[] covers) {
        this.users = users;
        this.loggedUser = loggedUser;
        this.cursos = cursos;
        this.carreras = carreras;
        this.covers = covers;
    }

    public Model() {
        this.loggedUser = new User();
        initCovers();
        initCursos();
        initCarreras();
        initUsers();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User loggedUser) {
        this.loggedUser = loggedUser;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public int[] getCovers() {
        return covers;
    }

    public void setCovers(int[] covers) {
        this.covers = covers;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    @Override
    public String toString() {
        return "Model{" +
                "users=" + users +
                ", loggedUser=" + loggedUser +
                ", cursos=" + cursos +
                ", carreras=" + carreras +
                '}';
    }

    public void cargaDatos(){

    }
    public void initCovers(){
        covers = new int[]{
                R.drawable.producto1,
                R.drawable.producto2,
                R.drawable.producto3,
                R.drawable.producto4,
                R.drawable.producto1,
                R.drawable.producto2,
                R.drawable.producto3,
                R.drawable.producto4};
    }

    public void initCursos(){

        cursos = new ArrayList<Curso>();

        Curso a = new Curso(1,"B101", "Programacion I", 4, 8, 1, new Ciclo(1), new Carrera(1));
        cursos.add(a);

        a = new Curso(2,"B102", "Programacion II", 4, 8, 1, new Ciclo(1), new Carrera(1));
        cursos.add(a);

        a = new Curso(3,"B103", "Programacion III", 4, 8, 2, new Ciclo(1), new Carrera(1));
        cursos.add(a);
    }

    public void initUsers(){

        users = new ArrayList<User>();

        // User(String name, int privilege, ArrayList<Product> selectedProducts, String email, String password)
        User u = new User("JDMurillo", 1, new ArrayList<Curso>(), new ArrayList<Carrera>(), "@co", "123456");
        users.add(u);

        ArrayList<Curso> pp = new ArrayList<Curso>();
        ArrayList<Carrera> cc = new ArrayList<Carrera>();
        pp.add(new Curso(1,"B101", "Programacion I", 4, 8, 1, new Ciclo(1), new Carrera(1)));
        pp.add(new Curso(2,"B102", "Programacion II", 4, 8, 1, new Ciclo(1), new Carrera(1)));
        u = new User("Allan", 2, pp,cc, "@allan", "");
        users.add(u);

        pp = new ArrayList<Curso>();
        cc = new ArrayList<Carrera>();
        pp.add(new Curso(3,"B103", "Programacion III", 4, 8, 2, new Ciclo(1), new Carrera(1)));
        u = new User("Luis", 2, pp, cc,"@luis", "");
        users.add(u);
    }

    public void initCarreras(){

        carreras = new ArrayList<Carrera>();

        Carrera a = new Carrera(1,"A101", "Informatica", "Diplomado");
        carreras.add(a);
         a = new Carrera(2,"A102", "Quimica", "Bachillerato");
        carreras.add(a);
        a = new Carrera(3,"A103", "Matematica", "Diplomado");
        carreras.add(a);

    }
}
