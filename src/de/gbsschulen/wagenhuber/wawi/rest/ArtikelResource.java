package de.gbsschulen.wagenhuber.wawi.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/artikel")
public class ArtikelResource {

    private ArtikelService artikelService = new ArtikelService();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Artikel> getAllArtikel() {
        return artikelService.getAllArtikel();
    }


    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Artikel getArtikel(@PathParam("id") int id) {
        return artikelService.getArtikel(id);
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String deleteArtikel(@PathParam("id") int id) {
        Artikel artikel;
        artikel = artikelService.deleteArtikel(id);

        if (artikel != null) {
            return artikel.getArtnr() + " " + artikel.getBezeichnung() + " wurde gelöscht!";
        }
        return "Fehler: Artikel nicht gefunden!";
    }


    @GET
    @Path("/query")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Artikel> getVkPreis(@QueryParam("vkpreis") double vkpreis) {
        return artikelService.getArtikelHigherThanPrice(vkpreis);
    }

}
