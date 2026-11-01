package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֡ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79J1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0189 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16418 f1310;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C19866 f1311;

    public C0189() {
        C16418 c16418 = new C16418(0);
        this.f1310 = c16418;
        this.f1311 = new C19866(c16418.f52811);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1405(C21356 c21356) {
        this.f1310.f52816 = c21356;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1402(C3677 c3677) {
        this.f1310.f52827 = c3677;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1407(EnumC20508... enumC20508Arr) {
        List<EnumC20508> listAsList = Arrays.asList(enumC20508Arr);
        if (listAsList == null) {
            throw new IllegalArgumentException("Dialects may not be null");
        }
        C16418 c16418 = this.f1310;
        c16418.f52812.clear();
        for (EnumC20508 enumC20508 : listAsList) {
            if (enumC20508 == null) {
                throw new IllegalArgumentException("Dialect may not be null");
            }
            c16418.f52812.add(enumC20508);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1400(UUID uuid) {
        if (uuid == null) {
            throw new IllegalArgumentException("Client GUID may not be null");
        }
        this.f1310.f52820 = uuid;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1399(ArrayList arrayList) {
        C16418 c16418 = this.f1310;
        c16418.f52822.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC20094 interfaceC20094 = (InterfaceC20094) it.next();
            if (interfaceC20094 == null) {
                throw new IllegalArgumentException("Authenticator may not be null");
            }
            c16418.f52822.add(interfaceC20094);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m1414() {
        this.f1310.getClass();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m1410(boolean z) {
        this.f1310.f52829 = z;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m1408() {
        this.f1310.f52815 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m1411() {
        C16418 c16418 = this.f1310;
        c16418.f52821 = 1048576;
        c16418.f52818 = 1048576;
        c16418.f52824 = 1048576;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m1412(TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(60L);
        C16418 c16418 = this.f1310;
        c16418.f52813 = millis;
        c16418.f52819 = timeUnit.toMillis(60L);
        c16418.f52825 = timeUnit.toMillis(60L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1403(C4449 c4449) {
        if (c4449 == null) {
            throw new IllegalArgumentException("Transport layer factory may not be null");
        }
        this.f1310.f52817 = c4449;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1401(TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(0L);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Socket timeout should be less than 2147483647ms");
        }
        this.f1310.f52823 = (int) millis;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16418 m1398() {
        C16418 c16418 = this.f1310;
        if (c16418.f52812.isEmpty()) {
            throw new IllegalStateException("At least one SMB dialect should be specified");
        }
        if (!c16418.f52829 && EnumC20508.m46304(c16418.f52812)) {
            throw new IllegalStateException("Signing cannot be disabled when using SMB3.x dialects");
        }
        if (c16418.f52814 && !EnumC20508.m46304(c16418.f52812)) {
            throw new IllegalStateException("If encryption is advertised, at least one dialect should be SMB3.x compatible");
        }
        c16418.f52828 = this.f1311.m45119();
        return new C16418(c16418);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m1409() {
        this.f1310.getClass();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m1413(boolean z) {
        this.f1310.f52826 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1404(C15713 c15713) {
        this.f1310.getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1406(boolean z) {
        this.f1310.f52814 = z;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m1397() {
        this.f1310.getClass();
    }
}
