package l;

/* JADX INFO: renamed from: l.᩷۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 86KD */
/* JADX INFO: loaded from: classes.dex */
public final class C22089 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f71185;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f71186;

    public C22089(String str) {
        this.f71185 = str;
        this.f71186 = 0;
    }

    public C22089(byte[] bArr) {
        C17359.requireNonNull(bArr);
        this.f71185 = null;
        this.f71186 = 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m49907() {
        return this.f71186;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m49906() {
        String str;
        int i = this.f71186;
        if (i == 0) {
            return this.f71185;
        }
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        if (i != 0) {
            str = i != 1 ? "Unknown" : "ArrayBuffer";
        } else {
            str = "String";
        }
        throw new IllegalStateException(C12669.m31438(sb, str, " expected, but got ", "String"));
    }
}
