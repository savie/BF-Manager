package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۗ۠۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 66KH */
/* JADX INFO: loaded from: classes2.dex */
public final class C3112 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9464 f11724;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_zip_create";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Create a ZIP archive from local files or directory contents using explicit sourcePath to entryPath mappings. Sources remain unchanged. ZIP names are case-sensitive; trailing / distinguishes directories, and leading /, . and .. are preserved literally. Conflicting mapped files are rejected. The output cannot be included in its own sources. A non-empty password encrypts file entries with AES-256. If saving fails, check the reported destination state before retrying.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Create ZIP";
    }

    public C3112(C9464 c9464) {
        this.f11724 = c9464;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        return C18828.m43457(JSON.object().add("outputPath", C4969.m13786("string", "Absolute or Home-relative destination ZIP file; its parent must exist. Split archives are not supported.")).add("sources", JSON.object().add("type", "array").add("items", C18828.m43457(JSON.object().add("sourcePath", C4969.m13786("string", "Absolute or Home-relative source file or directory; directories must end in /. Includes hidden files and empty directories.")), "string", "Complete destination ZIP entry path, not a basename. For a directory source, end in / or use an empty string for the root. Maps contents without the source folder name: images/ to assets/ puts images/a.png at assets/a.png.", "entryPath", "One source mapping.")).add("description", "Non-empty source mappings; expanded targets must not conflict.")).add("overwrite", C4969.m13786(ClassTransform.BOOLEAN, "True permits replacing an existing regular output file; recommended false.")).add("level", C4969.m13786("integer", "Compression level 0 through 9: 0 stores files without compression; 1 through 9 use Deflate, from fastest to strongest compression. Recommended 6.")), "string", "Empty string for no encryption; otherwise the password for new file entries.", "password", "Arguments for mt_zip_create.");
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        return C4148.m11791("mt_zip_create", false);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C4148.m11792(c12731, false);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        return new C17669(C0735.m3193(this.f11724.m24234(jSONObject), JSON.array()));
    }
}
