package l;

/* JADX INFO: renamed from: l.ܶ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public class C15758 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f51292;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C15758[] f51293;

    public C15758(String str, C15758... c15758Arr) {
        this.f51292 = str;
        this.f51293 = c15758Arr;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo15967(Object obj) {
        C17007 c17007 = (C17007) obj;
        Object[] objArrM40085 = c17007.m40085();
        if (c17007.mo32405().matches(this.f51292)) {
            C15758[] c15758Arr = this.f51293;
            if (c15758Arr.length == c17007.m40085().length) {
                for (int i = 0; i < objArrM40085.length; i++) {
                    if (!c15758Arr[i].mo15967(objArrM40085[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
