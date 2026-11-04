package l;

/* JADX INFO: renamed from: l.ۖܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 29AZ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2720 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m9059() {
        String name = ((C9431) this).f30601.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? name : name.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m9060() {
        String name = ((C9431) this).f30601.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? "" : name.substring(iLastIndexOf);
    }
}
