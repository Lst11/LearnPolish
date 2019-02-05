import com.lst11.data.db.entity.WordDB
import com.lst11.domain.entity.Word

fun WordDB.transformToDomain(): Word {
    return Word(wordPL = wordPL, wordRU = wordRU.toMutableList())
}


