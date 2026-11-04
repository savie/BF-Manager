package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܳۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79J1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15065 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12828 f49193;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C15480 f49194;

    public C15065() {
        C12828 c12828 = new C12828(0);
        this.f49193 = c12828;
        this.f49194 = new C15480(c12828.f41086);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36302(C9689 c9689) {
        this.f49193.f41084 = c9689;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36300(C0521 c0521) {
        this.f49193.f41090 = c0521;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36305(EnumC15700... enumC15700Arr) {
        List<EnumC15700> listAsList = Arrays.asList(enumC15700Arr);
        if (listAsList == null) {
            throw new IllegalArgumentException("Dialects may not be null");
        }
        C12828 c12828 = this.f49193;
        c12828.f41094.clear();
        for (EnumC15700 enumC15700 : listAsList) {
            if (enumC15700 == null) {
                throw new IllegalArgumentException("Dialect may not be null");
            }
            c12828.f41094.add(enumC15700);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36298(UUID uuid) {
        if (uuid == null) {
            throw new IllegalArgumentException("Client GUID may not be null");
        }
        this.f49193.f41083 = uuid;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36297(ArrayList arrayList) {
        C12828 c12828 = this.f49193;
        c12828.f41093.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC19912 interfaceC19912 = (InterfaceC19912) it.next();
            if (interfaceC19912 == null) {
                throw new IllegalArgumentException("Authenticator may not be null");
            }
            c12828.f41093.add(interfaceC19912);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m36308() {
        this.f49193.getClass();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m36307(boolean z) {
        this.f49193.f41096 = z;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m36309() {
        this.f49193.f41091 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36310() {
        C12828 c12828 = this.f49193;
        c12828.f41081 = 1048576;
        c12828.f41085 = 1048576;
        c12828.f41088 = 1048576;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36311(TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(60L);
        C12828 c12828 = this.f49193;
        c12828.f41078 = millis;
        c12828.f41082 = timeUnit.toMillis(60L);
        c12828.f41095 = timeUnit.toMillis(60L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36301(C1112 c1112) {
        if (c1112 == null) {
            throw new IllegalArgumentException("Transport layer factory may not be null");
        }
        this.f49193.f41079 = c1112;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36299(TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(0L);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Socket timeout should be less than 2147483647ms");
        }
        this.f49193.f41089 = (int) millis;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12828 m36296() {
        C12828 c12828 = this.f49193;
        if (c12828.f41094.isEmpty()) {
            throw new IllegalStateException("At least one SMB dialect should be specified");
        }
        if (!c12828.f41096 && EnumC15700.m37474(c12828.f41094)) {
            throw new IllegalStateException("Signing cannot be disabled when using SMB3.x dialects");
        }
        if (c12828.f41080 && !EnumC15700.m37474(c12828.f41094)) {
            throw new IllegalStateException("If encryption is advertised, at least one dialect should be SMB3.x compatible");
        }
        c12828.f41087 = this.f49194.m37045();
        return new C12828(c12828);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m36306() {
        this.f49193.getClass();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36312(boolean z) {
        this.f49193.f41092 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36303(C22525 c22525) {
        this.f49193.getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36304(boolean z) {
        this.f49193.f41080 = z;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m36313() {
        this.f49193.getClass();
    }
}
