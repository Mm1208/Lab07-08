package com.miker.login;

import com.google.gson.Gson;
import com.miker.login.carrera.Carrera;
import com.miker.login.curso.Curso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ServicioActualizar {
    public final static String LIST_CURSO_URL = "http://10.0.2.2:8080/SIMA/curso?opcion=list";
    public final static String INSERT_CURSO_URL = "http://10.0.2.2:8080/SIMA/curso?opcion=insert";
    public final static String UPDATE_CURSO_URL = "http://10.0.2.2:8080/SIMA/curso?opcion=update";
    public final static String DELETE_CURSO_URL = "http://10.0.2.2:8080/SIMA/curso?opcion=delete";
    private final static Gson gson = new Gson();
    private final static ServicioActualizar servicioActualizar = new ServicioActualizar();

    public static ServicioActualizar getServicioActualizar() {
        return servicioActualizar;
    }

    public static List<Curso> listCurso(String json_format) throws Exception {
        List<Curso> list = new ArrayList<>();
        try {
            JSONArray JSONList = new JSONArray(json_format);
            for (int i = 0; i < JSONList.length(); i++) {
                JSONObject dataDetail = JSONList.getJSONObject(i);
                list.add(
                        gson.fromJson(dataDetail.toString(), Curso.class)
                );
            }
        } catch (JSONException e) {
            throw e;
        }
        return list;
    }

    public static List<Carrera> listCarrera(String json_format) throws Exception {
        List<Carrera> list = new ArrayList<>();
        try {
            JSONArray JSONList = new JSONArray(json_format);
            for (int i = 0; i < JSONList.length(); i++) {
                JSONObject dataDetail = JSONList.getJSONObject(i);
                list.add(
                        gson.fromJson(dataDetail.toString(), Carrera.class)
                );
            }
        } catch (JSONException e) {
            throw e;
        }
        return list;
    }
}
