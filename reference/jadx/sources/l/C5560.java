package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۚۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66KH */
/* JADX INFO: loaded from: classes3.dex */
public final class C5560 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13017 f19305;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return C24579.m54898("readOnlyHint", "destructiveHint", false, true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Create ZIP";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Create a ZIP archive from local files or directory contents using explicit sourcePath to entryPath mappings. Sources remain unchanged. ZIP names are case-sensitive; trailing / distinguishes directories, and leading /, . and .. are preserved literally. Conflicting mapped files are rejected. The output cannot be included in its own sources. A non-empty password encrypts file entries with AES-256. If saving fails, check the reported destination state before retrying.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_zip_create";
    }

    public C5560(C13017 c13017) {
        this.f19305 = c13017;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        return C22783.m51386(JSON.object().add("outputPath", C10932.m27740("string", "Absolute or Home-relative destination ZIP file; its parent must exist. Split archives are not supported.")).add("sources", JSON.object().add("type", "array").add("items", C22783.m51386(JSON.object().add("sourcePath", C10932.m27740("string", "Absolute or Home-relative source file or directory; directories must end in /. Includes hidden files and empty directories.")), "string", "Complete destination ZIP entry path, not a basename. For a directory source, end in / or use an empty string for the root. Maps contents without the source folder name: images/ to assets/ puts images/a.png at assets/a.png.", "entryPath", "One source mapping.")).add("description", "Non-empty source mappings; expanded targets must not conflict.")).add("overwrite", C10932.m27740(ClassTransform.BOOLEAN, "True permits replacing an existing regular output file; recommended false.")).add("level", C10932.m27740("integer", "Compression level 0 through 9: 0 stores files without compression; 1 through 9 use Deflate, from fastest to strongest compression. Recommended 6.")), "string", "Empty string for no encryption; otherwise the password for new file entries.", "password", "Arguments for mt_zip_create.");
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        return C20476.m46979("mt_zip_create", false);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C20476.m46980(c10186, false);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        return new C1238(C15300.m36728(this.f19305.m32443(jSONObject), JSON.array()));
    }
}
