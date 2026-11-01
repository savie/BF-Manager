package l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֨֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27NH */
/* JADX INFO: loaded from: classes2.dex */
public final class C0801 implements InterfaceC22155 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f3398;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f3399;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f3400;

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C7648 mo3145() {
        return null;
    }

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3146(C2398 c2398) {
    }

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ byte[] mo3147() {
        return null;
    }

    public C0801(String str, String str2, List list) {
        this.f3398 = str;
        this.f3400 = str2;
        this.f3399 = C0561.unmodifiableList(new ArrayList(list));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f3398;
        sb.append(str != null ? C22697.m50267(C12441.m30914(" [", str, ", "), this.f3400, "]") : "");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0801.class == obj.getClass()) {
            C0801 c0801 = (C0801) obj;
            if (TextUtils.equals(this.f3398, c0801.f3398) && TextUtils.equals(this.f3400, c0801.f3400) && this.f3399.equals(c0801.f3399)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f3398;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3400;
        return this.f3399.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
