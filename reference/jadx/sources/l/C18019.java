package l;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07NF */
/* JADX INFO: loaded from: classes5.dex */
public final class C18019 implements InterfaceC22024 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C15648 f59003;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C15648 f59004;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f59005;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22024 f59006;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C15648 f59007;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f59008;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C15648 f59009;

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo14382(long j) {
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final int mo14380(InterfaceC9461 interfaceC9461, int i, boolean z) {
        return mo14386(interfaceC9461, i, z);
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final void mo14381(int i, C21287 c21287) {
        mo14385(c21287, i, 0);
    }

    static {
        C20124 c20124 = new C20124();
        c20124.m46315("application/id3");
        f59003 = c20124.m46295();
        C20124 c20125 = new C20124();
        c20125.m46315("application/x-emsg");
        f59004 = c20125.m46295();
    }

    public C18019(InterfaceC22024 interfaceC22024, int i) {
        this.f59006 = interfaceC22024;
        if (i == 1) {
            this.f59009 = f59003;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(C13645.m33382(i, "Unknown metadataType: "));
            }
            this.f59009 = f59004;
        }
        this.f59005 = new byte[0];
        this.f59008 = 0;
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final void mo14384(C15648 c15648) {
        this.f59007 = c15648;
        this.f59006.mo14384(this.f59009);
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ᩷ */
    public final int mo14386(InterfaceC9461 interfaceC9461, int i, boolean z) throws EOFException {
        int i2 = this.f59008 + i;
        byte[] bArr = this.f59005;
        if (bArr.length < i2) {
            this.f59005 = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int i3 = interfaceC9461.read(this.f59005, this.f59008, i);
        if (i3 != -1) {
            this.f59008 += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final void mo14385(C21287 c21287, int i, int i2) {
        int i3 = this.f59008 + i;
        byte[] bArr = this.f59005;
        if (bArr.length < i3) {
            this.f59005 = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        c21287.m48490(this.f59008, i, this.f59005);
        this.f59008 += i;
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final void mo14383(long j, int i, int i2, int i3, C4870 c4870) {
        this.f59007.getClass();
        int i4 = this.f59008 - i3;
        C21287 c21287 = new C21287(Arrays.copyOfRange(this.f59005, i4 - i2, i4));
        byte[] bArr = this.f59005;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f59008 = i3;
        String str = this.f59007.f50848;
        C15648 c15648 = this.f59009;
        String str2 = c15648.f50848;
        String str3 = c15648.f50848;
        if (!C17359.equals(str, str2)) {
            if ("application/x-emsg".equals(this.f59007.f50848)) {
                C11976 c11976M56765 = C25403.m56765(c21287);
                C15648 c15648Mo12245 = c11976M56765.mo12245();
                if (c15648Mo12245 == null || !C17359.equals(str3, c15648Mo12245.f50848)) {
                    C1896.m6517("Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + c11976M56765.mo12245());
                    return;
                }
                byte[] bArrMo12247 = c11976M56765.mo12247();
                bArrMo12247.getClass();
                c21287 = new C21287(bArrMo12247);
            } else {
                C1896.m6517("Ignoring sample for unsupported format: " + this.f59007.f50848);
                return;
            }
        }
        int iM48486 = c21287.m48486();
        InterfaceC22024 interfaceC22024 = this.f59006;
        interfaceC22024.mo14381(iM48486, c21287);
        interfaceC22024.mo14383(j, i, iM48486, 0, c4870);
    }
}
