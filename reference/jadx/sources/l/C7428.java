package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۟ۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7428 extends AbstractC17535 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC9677 f24788;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f24789;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 f24790;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f24791;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f24792;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13689 f24793;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f24794;

    public C7428(int i, C13689 c13689, InterfaceC2557 interfaceC2557, long j, String str, boolean z, AbstractC9677 abstractC9677) {
        this.f24789 = i;
        this.f24793 = c13689;
        this.f24790 = interfaceC2557;
        this.f24794 = j;
        this.f24792 = str;
        this.f24791 = z;
        this.f24788 = abstractC9677;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7428)) {
            return false;
        }
        C7428 c7428 = (C7428) obj;
        return this.f24791 == c7428.f24791 && this.f24789 == c7428.f24789 && this.f24794 == c7428.f24794 && C13638.equals(this.f24793, c7428.f24793) && C13638.equals(this.f24790, c7428.f24790) && C13638.equals(this.f24792, c7428.f24792) && C13638.equals(this.f24788, c7428.f24788);
    }

    public final int hashCode() {
        int iM41614 = C17922.m41614(this.f24791 ? 1231 : 1237, 31, this.f24789, 31);
        long j = this.f24794;
        return C13638.hashCode(this.f24788) + C0589.m2789((C13638.hashCode(this.f24790) + ((C13638.hashCode(this.f24793) + ((iM41614 + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31, 31, this.f24792);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f24789), this.f24793, this.f24790, Long.valueOf(this.f24794), this.f24792, Boolean.valueOf(this.f24791), this.f24788};
        String[] strArrSplit = "requestToken;mediaItem;fileItem;startPosition;playbackPositionKey;skipRememberedSubtitleFileRestore;subtitleVisitor".length() == 0 ? new String[0] : "requestToken;mediaItem;fileItem;startPosition;playbackPositionKey;skipRememberedSubtitleFileRestore;subtitleVisitor".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C7428.class, sb, "[");
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

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m19910() {
        return this.f24791;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m19911() {
        return this.f24792;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 m19912() {
        return this.f24790;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C13689 m19913() {
        return this.f24793;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long m19914() {
        return this.f24794;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC9677 m19915() {
        return this.f24788;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m19916() {
        return this.f24789;
    }
}
