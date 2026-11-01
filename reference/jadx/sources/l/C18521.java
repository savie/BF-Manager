package l;

/* JADX INFO: renamed from: l.ᩴۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9R5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18521 extends AbstractDialogInterfaceOnClickListenerC1587 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8644[] f58980;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f58981;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f58982;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18521(AbstractActivityC12483 abstractActivityC12483, C8644[] c8644Arr, boolean[] zArr) {
        super(abstractActivityC12483);
        this.f58980 = c8644Arr;
        this.f58981 = zArr;
        this.f58982 = 0;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC1587
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5419() {
        int i = this.f58982;
        C8644[] c8644Arr = this.f58980;
        C8644 c8644 = c8644Arr[i];
        String str = c8644.f29819;
        String str2 = c8644.f29819;
        C13638.requireNonNull(str);
        C13638.requireNonNull(c8644.f29820);
        if (!this.f58981[0]) {
            m5418(str2, c8644.f29820);
        } else {
            m5418(c8644.f29820, str2);
        }
        int i2 = this.f58982 + 1;
        this.f58982 = i2;
        return i2 < c8644Arr.length;
    }
}
