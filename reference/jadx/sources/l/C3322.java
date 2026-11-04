package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۗۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6KW */
/* JADX INFO: loaded from: classes3.dex */
public final class C3322 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13017 f10866;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return C24579.m54898("readOnlyHint", "destructiveHint", false, true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Update ZIP";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Add, delete, or rename entries in an existing ZIP archive. Operations are unordered and refer to the original ZIP; chains, swaps, repeated changes, competing targets, and overlapping rename/delete directory ranges are rejected before writing. ZIP names are case-sensitive; abc and abc/ are distinct, and leading /, . and .. are preserved literally. New files use deflate; replacements preserve the original compression method. Unchanged and renamed entries retain their original encryption and passwords. Updating a damaged archive may discard unreadable entries, even outside the requested changes; use mt_zip_test first if integrity needs checking. No APK signing is performed. If saving fails, check the reported destination state before retrying.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_zip_update";
    }

    public C3322(C13017 c13017) {
        this.f10866 = c13017;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        return C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Absolute or Home-relative existing ZIP file; split archives are not supported.")).add("operations", C22121.m50076("type", "array", "description", "Non-empty unordered modifications. File operations must omit directory-only fields.").add("items", JSON.object().add("anyOf", JSON.array().add(C10932.m27731(m10957("add", "Add a local file or directory.").add("sourcePath", C10932.m27740("string", "Absolute or Home-relative source file or directory; directories must end in /. Includes hidden files and empty directories.")).add("entryPath", C10932.m27740("string", "Complete destination ZIP entry path, not a basename. Files have no trailing /; directory sources require / or an empty string for the root. Maps contents without the source folder name: images/ to assets/ puts images/a.png at assets/a.png.")).add("overwrite", C10932.m27740(ClassTransform.BOOLEAN, "True permits replacing original files at mapped names; recommended false. Never resolves conflicts between operations.")), "Add.")).add(C10932.m27731(m10957("delete", "Delete one original file.").add("entryPath", C10932.m27740("string", "Non-empty exact ZIP file path without a trailing /.")), "Delete file.")).add(C10932.m27731(m10957("delete", "Delete an original directory.").add("entryPath", C10932.m27740("string", "Non-empty exact ZIP directory path ending in /; / is a literal directory name, distinct from the empty ZIP root.")).add("recursive", C10932.m27740(ClassTransform.BOOLEAN, "True is required when the directory contains entries.")), "Delete directory.")).add(C10932.m27731(m10957("rename", "Rename one original file.").add("entryPath", C10932.m27740("string", "Non-empty exact ZIP file path without a trailing /.")).add("newEntryPath", C10932.m27740("string", "Complete destination ZIP file path, not a basename, without a trailing /. To rename in place, retain the parent: docs/a.txt to docs/b.txt. A different target file must not already exist.")), "Rename file.")).add(C10932.m27731(m10957("rename", "Rename an original directory, including its descendants.").add("entryPath", C10932.m27740("string", "Non-empty exact ZIP directory path ending in /; / is a literal directory name, distinct from the empty ZIP root.")).add("newEntryPath", C10932.m27740("string", "Complete destination ZIP directory path, not a basename, ending in /. Retain the parent to rename in place: docs/old/ to docs/new/. Cannot be empty or a descendant of the source directory; / is a literal directory name.")).add("mergeDirectories", C10932.m27740(ClassTransform.BOOLEAN, "True permits recursively merging an existing destination directory; recommended false. Same-name files still reject the whole request.")), "Rename directory."))))), "string", "Output password for all files added or replaced in this call: empty string writes them unencrypted; otherwise encrypts them with AES-256. The old password is not required or verified. Pass an empty string for delete/rename-only requests.", "password", "Arguments for mt_zip_update.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m10957(String str, String str2) {
        return JSON.object().add("type", C10932.m27735(str, str2));
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        return C20476.m46979("mt_zip_update", false);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C20476.m46980(c10186, false);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        return new C1238(C15300.m36728(this.f10866.m32444(jSONObject), JSON.array()));
    }
}
