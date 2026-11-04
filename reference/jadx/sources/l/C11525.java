package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۧۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6KT */
/* JADX INFO: loaded from: classes4.dex */
public final class C11525 extends AbstractC17492 {
    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "List ZIP Entries";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "List entries in a ZIP archive, including directories implied by file paths. Names are case-sensitive; directories end with /, and leading /, . and .. are preserved literally. Recursive results use depth-first name order. Keep the ZIP unchanged while paging and use the returned continuation; if the cursor expires, use the returned restart action. Listing does not verify integrity; use mt_zip_test for that.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_zip_list";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        return C22783.m51386(AbstractC17492.m41000(false).add("entryPath", C10932.m27740("string", "Exact ZIP directory path ending with /. Pass an empty string for the ZIP root; / selects the directory literally named /, not the root.")).add("recursive", C10932.m27740(ClassTransform.BOOLEAN, "Whether to include all descendants; pass false initially.")).add("simple", C10932.m27740(ClassTransform.BOOLEAN, "True returns only relative entry names; recommended for browsing. False includes sizes and encryption status.")).add("cursor", C10932.m27740("string", "Pass an empty string initially; for later pages use the returned continuation. Only limit and simple may change between pages.")), "integer", "Maximum entries per page, 1..1000; suggested 200.", "limit", "Arguments for mt_zip_list.");
    }

    @Override // l.AbstractC17492
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final JSONObject mo29017() {
        return C10932.m27731(AbstractC17492.m40999().put("entryPath", C10932.m27740("string", "Exact ZIP directory prefix shared by all listed relative paths; empty for the root.")).add("listing", C10932.m27742("One entry per element. With simple=true, each string is the raw relative path. Otherwise: size compressedSize encryption relativePath; split only at the first three ASCII spaces. size is uncompressed bytes; compressedSize is compressed bytes. Directories sum descendants; - means unavailable. Encryption is e for encrypted files, otherwise -; directories do not summarize descendant encryption. Paths ending in / are directories. Preserve the path verbatim, including spaces and newlines. Concatenate data.entryPath and the relative path directly for other ZIP tools; never normalize leading slashes or dot segments. Empty array for no entries.")).add("pagination", C22783.m51386(JSON.object().add("hasMore", C10932.m27740(ClassTransform.BOOLEAN, "Whether another page remains.")), "string", "Opaque continuation token, or empty string at the end.", "nextCursor", "Listing continuation.")), "One ZIP directory page.");
    }

    @Override // l.AbstractC17492
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final JSONObject mo29018(JSONObject jSONObject) {
        return this.f56851.m2715(jSONObject);
    }

    @Override // l.AbstractC17492
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONArray mo29016(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = jSONObject2.getJSONObject("pagination");
        if (!jSONObject3.getBoolean("hasMore")) {
            return JSON.array();
        }
        return JSON.array().add(C2729.m9064(new JSONObject(jSONObject).put(MotionUtils.EASING_TYPE_PATH, jSONObject2.getString(MotionUtils.EASING_TYPE_PATH)).put("cursor", jSONObject3.getString("nextCursor")), "mt_zip_list", "continue", "Read the next ZIP directory page."));
    }
}
