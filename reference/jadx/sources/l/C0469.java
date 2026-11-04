package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.֡ܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8DD */
/* JADX INFO: loaded from: classes3.dex */
public final class C0469 implements InterfaceC22486, InterfaceC9060 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f2082;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C18368 f2083;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f2086;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f2088;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f2089;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f2087 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f2085 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final PriorityQueue f2081 = new PriorityQueue();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21287 f2084 = new C21287(512);

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long mo2295() {
        return -9223372036854775807L;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22486 mo2296() {
        return this;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo2298() {
        return true;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List mo2297() {
        return AbstractC1928.of();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        if (this.f2087 != 0) {
            throw new IllegalStateException();
        }
        C18368 c18368 = new C18368(interfaceC12789.mo16658(0, 1));
        this.f2083 = c18368;
        C20124 c20124 = new C20124();
        c20124.m46300("audio/midi");
        c20124.m46327("audio/midi");
        c20124.m46315("audio/x-exoplayer-midi");
        c18368.mo14384(c20124.m46295());
        interfaceC12789.mo16661();
        interfaceC12789.mo16659(this);
        this.f2087 = 1;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo2294(InterfaceC19502 interfaceC19502) {
        C21287 c21287 = new C21287(4);
        ((C9169) interfaceC19502).mo10078(false, 0, 4, c21287.m48497());
        return c21287.m48500() == 1297377380;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2292(long j, long j2) {
        C20782.m47568(this.f2087 != 4);
        this.f2089 = j2;
        C18368 c18368 = this.f2083;
        if (c18368 != null) {
            c18368.m42833();
        }
        if (this.f2087 == 1) {
            this.f2084.m48510(0);
            this.f2082 = 0;
        } else {
            this.f2087 = 2;
        }
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) throws C2970 {
        int i = this.f2087;
        ArrayList<C7181> arrayList = this.f2085;
        int i2 = -1;
        if (i == 1) {
            int iM42970 = C18444.m42970(interfaceC19502.getLength());
            C21287 c21287 = this.f2084;
            int length = c21287.m48497().length;
            if (this.f2082 == length) {
                if (iM42970 != -1) {
                    length = iM42970;
                }
                c21287.m48489((length * 3) / 2);
            }
            int i3 = interfaceC19502.read(c21287.m48497(), this.f2082, c21287.m48513() - this.f2082);
            if (i3 != -1) {
                int i4 = this.f2082 + i3;
                this.f2082 = i4;
                if (iM42970 == -1 || i4 != iM42970) {
                    return 0;
                }
            }
            c21287.m48517(this.f2082);
            if (c21287.m48486() < 14) {
                throw C2970.m9688((String) null, (Throwable) null);
            }
            if (c21287.m48500() != 1297377380) {
                throw C2970.m9688((String) null, (Throwable) null);
            }
            c21287.m48503(4);
            short sM48511 = c21287.m48511();
            short sM48512 = c21287.m48511();
            if (sM48512 <= 0) {
                throw C2970.m9688((String) null, (Throwable) null);
            }
            this.f2086 = c21287.m48511();
            for (int i5 = 0; i5 < sM48512; i5++) {
                if (c21287.m48486() < 8) {
                    throw C2970.m9688((String) null, (Throwable) null);
                }
                if (c21287.m48500() != 1297379947) {
                    throw C2970.m9688((String) null, (Throwable) null);
                }
                int iM48500 = c21287.m48500();
                if (iM48500 > 0) {
                    byte[] bArr = new byte[iM48500];
                    if (c21287.m48486() < iM48500) {
                        throw C2970.m9688((String) null, (Throwable) null);
                    }
                    c21287.m48490(0, iM48500, bArr);
                    arrayList.add(new C7181(sM48511, this.f2086, new C21287(bArr), new C1793(this)));
                } else {
                    throw C2970.m9688((String) null, (Throwable) null);
                }
            }
            this.f2087 = 2;
            return 0;
        }
        PriorityQueue priorityQueue = this.f2081;
        if (i != 2) {
            if (i == 3) {
                C7181 c7181 = (C7181) priorityQueue.poll();
                c7181.getClass();
                long jM19754 = c7181.m19754();
                if (jM19754 != -9223372036854775807L) {
                    long j = this.f2088 + 100000;
                    if (j < jM19754) {
                        this.f2088 = j;
                        C18368 c18368 = this.f2083;
                        C20782.m47566(c18368);
                        c18368.mo14383(this.f2088, 0, 0, 0, null);
                    } else {
                        this.f2088 = jM19754;
                        C18368 c18369 = this.f2083;
                        C20782.m47566(c18369);
                        c7181.m19755(c18369, false);
                        c7181.m19758();
                    }
                    i2 = 0;
                }
                priorityQueue.add(c7181);
                return i2;
            }
            throw new IllegalStateException();
        }
        priorityQueue.clear();
        for (C7181 c7182 : arrayList) {
            c7182.m19756();
            c7182.m19758();
        }
        priorityQueue.addAll(arrayList);
        long j2 = this.f2089;
        while (!priorityQueue.isEmpty()) {
            C7181 c7183 = (C7181) priorityQueue.poll();
            c7183.getClass();
            long jM19755 = c7183.m19754();
            if (jM19755 != -9223372036854775807L && jM19755 < j2) {
                C18368 c183610 = this.f2083;
                C20782.m47566(c183610);
                c7183.m19755(c183610, true);
                c7183.m19758();
                priorityQueue.add(c7183);
            }
        }
        priorityQueue.addAll(arrayList);
        this.f2088 = this.f2089;
        C7181 c7184 = (C7181) priorityQueue.peek();
        c7184.getClass();
        if (c7184.m19754() > this.f2088) {
            C18368 c183611 = this.f2083;
            C20782.m47566(c183611);
            c183611.mo14383(this.f2088, 0, 0, 0, null);
        }
        this.f2087 = 3;
        return 0;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2291() {
        this.f2085.clear();
        this.f2081.clear();
        byte[] bArr = C7116.f23453;
        C21287 c21287 = this.f2084;
        c21287.getClass();
        c21287.m48491(bArr.length, bArr);
        this.f2087 = 4;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9805 mo2290(long j) {
        int i = this.f2087;
        if (i == 2 || i == 3) {
            C2349 c2349 = new C2349(j, 14L);
            return new C9805(c2349, c2349);
        }
        C2349 c23410 = C2349.f7572;
        return new C9805(c23410, c23410);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2288(C0469 c0469, int i, long j) {
        Iterator it = c0469.f2085.iterator();
        while (it.hasNext()) {
            ((C7181) it.next()).m19757(i, j);
        }
    }
}
