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
    public final static String ACTUALIZA_CURSO_URL = "http://10.0.2.2:8080/SIMA/curso?opcion=synchronizer";
    public final static String ACTUALIZA_CARRERA_URL = "http://10.0.2.2:8080/SIMA/carrera?opcion=synchronizer";

    private final static Gson gson = new Gson();
    private final static ServicioActualizar servicioActualizar = new ServicioActualizar();

    public static ServicioActualizar getServicioActualizar() {
        return servicioActualizar;
    }
}
