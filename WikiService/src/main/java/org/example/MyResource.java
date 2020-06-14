package org.aksw.agdistis;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;
import org.aksw.agdistis.util.GetWikiData;



@Path("myresource")
public class MyResource {
    //WikiServiceRepository repository= new WikiServiceRepository();
    GetWikiData repo= new GetWikiData();
    @GET
    @Path("/fetchDocx")
    @Produces(MediaType.APPLICATION_JSON)
    public List<WikiData> getData(@QueryParam("q") String queryTerms)
    {
        System.out.println("Called from resource");
        return repo.sendData(queryTerms);
        //return repository.getAllWikiData();
    }
/*
    @GET
    @Path("wiki/{label}")
    @Produces(MediaType.APPLICATION_JSON)
    public WikiData getData(@PathParam("label") String label)
    {
        return repository.getData(label);
    }



    @POST
    @Path("add")
    @Consumes(MediaType.APPLICATION_JSON)
    public WikiData createWikiData(WikiData wikidata)
    {
        repository.createData(wikidata);
        return wikidata;

    }

 */

}
