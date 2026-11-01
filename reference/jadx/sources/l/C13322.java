package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۬᩵۬, reason: contains not printable characters */
/* JADX INFO: compiled from: G6KW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13322 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9464 f44209;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_zip_update";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Add, delete, or rename entries in an existing ZIP archive. Operations are unordered and refer to the original ZIP; chains, swaps, repeated changes, competing targets, and overlapping rename/delete directory ranges are rejected before writing. ZIP names are case-sensitive; abc and abc/ are distinct, and leading /, . and .. are preserved literally. New files use deflate; replacements preserve the original compression method. Unchanged and renamed entries retain their original encryption and passwords. Updating a damaged archive may discard unreadable entries, even outside the requested changes; use mt_zip_test first if integrity needs checking. No APK signing is performed. If saving fails, check the reported destination state before retrying.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Update ZIP";
    }

    public C13322(C9464 c9464) {
        this.f44209 = c9464;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        return C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Absolute or Home-relative existing ZIP file; split archives are not supported.")).add("operations", C3184.m9603("type", "array", "description", "Non-empty unordered modifications. File operations must omit directory-only fields.").add("items", JSON.object().add("anyOf", JSON.array().add(C4969.m13777(m32834("add", "Add a local file or directory.").add("sourcePath", C4969.m13786("string", "Absolute or Home-relative source file or directory; directories must end in /. Includes hidden files and empty directories.")).add("entryPath", C4969.m13786("string", "Complete destination ZIP entry path, not a basename. Files have no trailing /; directory sources require / or an empty string for the root. Maps contents without the source folder name: images/ to assets/ puts images/a.png at assets/a.png.")).add("overwrite", C4969.m13786(ClassTransform.BOOLEAN, "True permits replacing original files at mapped names; recommended false. Never resolves conflicts between operations.")), "Add.")).add(C4969.m13777(m32834("delete", "Delete one original file.").add("entryPath", C4969.m13786("string", "Non-empty exact ZIP file path without a trailing /.")), "Delete file.")).add(C4969.m13777(m32834("delete", "Delete an original directory.").add("entryPath", C4969.m13786("string", "Non-empty exact ZIP directory path ending in /; / is a literal directory name, distinct from the empty ZIP root.")).add("recursive", C4969.m13786(ClassTransform.BOOLEAN, "True is required when the directory contains entries.")), "Delete directory.")).add(C4969.m13777(m32834("rename", "Rename one original file.").add("entryPath", C4969.m13786("string", "Non-empty exact ZIP file path without a trailing /.")).add("newEntryPath", C4969.m13786("string", "Complete destination ZIP file path, not a basename, without a trailing /. To rename in place, retain the parent: docs/a.txt to docs/b.txt. A different target file must not already exist.")), "Rename file.")).add(C4969.m13777(m32834("rename", "Rename an original directory, including its descendants.").add("entryPath", C4969.m13786("string", "Non-empty exact ZIP directory path ending in /; / is a literal directory name, distinct from the empty ZIP root.")).add("newEntryPath", C4969.m13786("string", "Complete destination ZIP directory path, not a basename, ending in /. Retain the parent to rename in place: docs/old/ to docs/new/. Cannot be empty or a descendant of the source directory; / is a literal directory name.")).add("mergeDirectories", C4969.m13786(ClassTransform.BOOLEAN, "True permits recursively merging an existing destination directory; recommended false. Same-name files still reject the whole request.")), "Rename directory."))))), "string", "Output password for all files added or replaced in this call: empty string writes them unencrypted; otherwise encrypts them with AES-256. The old password is not required or verified. Pass an empty string for delete/rename-only requests.", "password", "Arguments for mt_zip_update.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m32834(String str, String str2) {
        return JSON.object().add("type", C4969.m13781(str, str2));
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        return C4148.m11791("mt_zip_update", false);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C4148.m11792(c12731, false);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        return new C17669(C0735.m3193(this.f44209.m24235(jSONObject), JSON.array()));
    }
}
