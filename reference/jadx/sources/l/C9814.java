package l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۢۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27NH */
/* JADX INFO: loaded from: classes4.dex */
public final class C9814 implements InterfaceC8191 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f31617;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f31618;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f31619;

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C15648 mo12245() {
        return null;
    }

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo12246(C18632 c18632) {
    }

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ byte[] mo12247() {
        return null;
    }

    public C9814(String str, String str2, List list) {
        this.f31617 = str;
        this.f31619 = str2;
        this.f31618 = C4681.unmodifiableList(new ArrayList(list));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f31617;
        sb.append(str != null ? C8947.m23910(C22783.m51387(" [", str, ", "), this.f31619, "]") : "");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9814.class == obj.getClass()) {
            C9814 c9814 = (C9814) obj;
            if (TextUtils.equals(this.f31617, c9814.f31617) && TextUtils.equals(this.f31619, c9814.f31619) && this.f31618.equals(c9814.f31618)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f31617;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f31619;
        return this.f31618.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
