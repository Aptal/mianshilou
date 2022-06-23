package org.mianshilou.controller;

import com.google.gson.Gson;
import org.mianshilou.mapper.FavoritesMapper;
import org.mianshilou.pojo.Favorites;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*", "null"})
public class FavoritesController {
    @Autowired
    FavoritesMapper favoritesMapperr;

    private Gson gson =new Gson();

    @GetMapping("/favorites/select")
    public String getUserinfo() {
        List<Favorites> favoritesList = favoritesMapperr.selectList(null);
        return gson.toJson(favoritesList);
    }

    @PostMapping("/favorites/insert")
    public void addUserinfo(@RequestBody Favorites favorites) {
        favoritesMapperr.insert(favorites);
    }

    @PostMapping("/favorites/delete")
    public void removeUserinfo(@RequestBody Favorites favorites) {
        favoritesMapperr.deleteById(favorites);
    }

    @PostMapping("/favorites/update")
    public void updateUserinfo(@RequestBody Favorites favorites) {
        favoritesMapperr.updateById(favorites);
    }

}
