package l;

/* JADX INFO: renamed from: l.ܽܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86ZM */
/* JADX INFO: loaded from: classes5.dex */
public final class C17677 extends AbstractC2016 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3507[] f58080;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11974[] f58081;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C4868[] f58082;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15703 f58083;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f58084;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C18415 f58085;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f58086;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11974 f58087;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f58088;

    public C17677(C15703 c15703, int[] iArr, C11974[] c11974Arr, C4868[] c4868Arr, C3507[] c3507Arr, boolean z, C11974 c11974) {
        C4868 c4868;
        super(c15703.m37498());
        this.f58083 = c15703;
        C18415 c18415M37493 = c15703.m37493();
        this.f58085 = c18415M37493;
        this.f58088 = iArr;
        this.f58081 = c11974Arr;
        this.f58082 = c4868Arr;
        this.f58080 = c3507Arr;
        this.f58084 = z;
        this.f58087 = c11974;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= iArr.length) {
                for (C3507 c3507 : c3507Arr) {
                    if (c18415M37493.m42928(c3507.f12086)) {
                        break;
                    }
                }
                this.f58086 = z2;
            } else if (c18415M37493.m42928(iArr[i]) || ((c4868 = c4868Arr[i]) != null && (c18415M37493.m42928(c4868.m14922()) || c18415M37493.m42928(c4868.m14920())))) {
                break;
            } else {
                i++;
            }
        }
        z2 = true;
        this.f58086 = z2;
    }
}
