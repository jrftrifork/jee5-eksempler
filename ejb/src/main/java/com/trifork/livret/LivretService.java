package com.trifork.livret;

import javax.ejb.Local;
import java.util.List;

@Local
public interface LivretService {
    List<String> listLivretter();
}
