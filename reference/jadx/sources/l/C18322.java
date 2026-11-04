package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܿ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C18322 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 f59769;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f59770;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC7629 f59771;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f59772;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f59773;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14902 f59774;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f59775;

    public C18322(int i, C14902 c14902, InterfaceC2386 interfaceC2386, long j, String str, boolean z, AbstractC7629 abstractC7629) {
        this.f59775 = i;
        this.f59774 = c14902;
        this.f59769 = interfaceC2386;
        this.f59772 = j;
        this.f59770 = str;
        this.f59773 = z;
        this.f59771 = abstractC7629;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18322)) {
            return false;
        }
        C18322 c18322 = (C18322) obj;
        return this.f59773 == c18322.f59773 && this.f59775 == c18322.f59775 && this.f59772 == c18322.f59772 && C17359.equals(this.f59774, c18322.f59774) && C17359.equals(this.f59769, c18322.f59769) && C17359.equals(this.f59770, c18322.f59770) && C17359.equals(this.f59771, c18322.f59771);
    }

    public final int hashCode() {
        int iM42345 = C18176.m42345(this.f59773 ? 1231 : 1237, 31, this.f59775, 31);
        long j = this.f59772;
        return C17359.hashCode(this.f59771) + C24966.m55771((C17359.hashCode(this.f59769) + ((C17359.hashCode(this.f59774) + ((iM42345 + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31, 31, this.f59770);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f59775), this.f59774, this.f59769, Long.valueOf(this.f59772), this.f59770, Boolean.valueOf(this.f59773), this.f59771};
        String[] strArrSplit = "requestToken;mediaItem;fileItem;startPosition;playbackPositionKey;skipRememberedSubtitleFileRestore;subtitleVisitor".length() == 0 ? new String[0] : "requestToken;mediaItem;fileItem;startPosition;playbackPositionKey;skipRememberedSubtitleFileRestore;subtitleVisitor".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C18322.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 m42738() {
        return this.f59769;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m42739() {
        return this.f59772;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m42740() {
        return this.f59770;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m42741() {
        return this.f59773;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m42742() {
        return this.f59775;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC7629 m42743() {
        return this.f59771;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14902 m42744() {
        return this.f59774;
    }
}
