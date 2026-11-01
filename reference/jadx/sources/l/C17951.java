package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38SD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17951 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f57410;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f57411;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f57412;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f57413;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41776() {
        int i = this.f57411;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public C17951(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f57410 = str;
        this.f57411 = i2;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = C0561.unmodifiableList(arrayList);
        }
        this.f57412 = listUnmodifiableList;
        this.f57413 = bArr;
    }
}
