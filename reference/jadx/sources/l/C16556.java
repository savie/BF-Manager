package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C30H */
/* JADX INFO: loaded from: classes4.dex */
public final class C16556 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53179 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53180 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12323 m38975() {
        return new C12323(this.f53179, this.f53180);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38976(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str2 == null) {
            throw new NullPointerException("value == null");
        }
        this.f53179.add(C14440.m34727(str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
        this.f53180.add(C14440.m34727(str2, 0, str2.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
    }
}
