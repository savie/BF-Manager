package l;

/* JADX INFO: renamed from: l.᩶ۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4IW */
/* JADX INFO: loaded from: classes4.dex */
public final class C19875 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f63724;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f63725;

    public C19875(int i, int i2) {
        this.f63725 = i;
        this.f63724 = i2;
    }

    public final String toString() {
        int i = this.f63725;
        if (i == 0) {
            return "TYPE_ANNOTATION_START";
        }
        if (i == 1) {
            return "TYPE_ANNOTATION_END";
        }
        if (i == 2) {
            return "TYPE_FIELD_START";
        }
        if (i == 3) {
            return "TYPE_FIELD_END";
        }
        if (i != 4) {
            return i != 5 ? "???" : "TYPE_METHOD_END";
        }
        return "TYPE_METHOD_START";
    }
}
