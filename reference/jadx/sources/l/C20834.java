package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C20834 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List f67704;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC3899 f67705;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f67706;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C13689 f67707;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f67708;

    public /* synthetic */ C20834(C13689 c13689, List list, boolean z, EnumC3899 enumC3899, String str, int i) {
        this(c13689, list, z, enumC3899, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20834)) {
            return false;
        }
        C20834 c20834 = (C20834) obj;
        return this.f67706 == c20834.f67706 && C13638.equals(this.f67707, c20834.f67707) && C13638.equals(this.f67704, c20834.f67704) && C13638.equals(this.f67705, c20834.f67705) && C13638.equals(this.f67708, c20834.f67708);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f67708) + ((C13638.hashCode(this.f67705) + ((C13638.hashCode(this.f67704) + ((C13638.hashCode(this.f67707) + ((this.f67706 ? 1231 : 1237) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f67707, this.f67704, Boolean.valueOf(this.f67706), this.f67705, this.f67708};
        String[] strArrSplit = "mediaItem;subtitleMatches;subtitleMatchesResolved;externalSubtitleMode;externalSubtitlePath".length() == 0 ? new String[0] : "mediaItem;subtitleMatches;subtitleMatchesResolved;externalSubtitleMode;externalSubtitlePath".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C20834.class, sb, "[");
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
    public final boolean m46860() {
        return this.f67706;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C13689 m46861() {
        return this.f67707;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC3899 m46862() {
        return this.f67705;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m46863() {
        return this.f67708;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List m46864() {
        return this.f67704;
    }

    public C20834(C13689 c13689, List list, boolean z, EnumC3899 enumC3899, String str) {
        List listUnmodifiableList = C0561.unmodifiableList(new ArrayList(list));
        this.f67707 = c13689;
        this.f67704 = listUnmodifiableList;
        this.f67706 = z;
        this.f67705 = enumC3899;
        this.f67708 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20834 m46859(C13689 c13689, List list, boolean z) {
        return new C20834(c13689, list, z, EnumC3899.NONE, null);
    }
}
