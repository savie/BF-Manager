package l;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C10228 extends AbstractC16941 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22185 f32677;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC24329 f32678;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C19179 f32679;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f32680;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10228(C22185 c22185, InterfaceC24928 interfaceC24928, EnumC7687... enumC7687Arr) {
        super(interfaceC24928, enumC7687Arr);
        this.f32677 = c22185;
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4671(EnumC7687 enumC7687, String str) {
        if (!this.f55347.contains(enumC7687)) {
            return false;
        }
        this.f55346 = true;
        this.f32678 = str == null ? null : this.f32677.m50194(str, new String[0]);
        return true;
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ᩷ */
    public final Collection mo4675() {
        InterfaceC24329 interfaceC24329 = this.f32678;
        if (interfaceC24329 == null) {
            return null;
        }
        return Collections.singleton(interfaceC24329);
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final void mo4669(Iterable iterable) {
        if (iterable == null) {
            this.f32678 = null;
        } else {
            this.f55346 = true;
            this.f32678 = AbstractC16941.m39917(iterable);
        }
        this.f32679 = null;
        this.f32680 = false;
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC24928 mo4668(String str) {
        if (this.f32679 == null) {
            this.f32679 = new C19179(this.f32677);
        }
        C3517 c3517M44442 = this.f32679.m44442(str);
        if (c3517M44442 != null) {
            return c3517M44442;
        }
        C3517 c3517 = new C3517(this.f32677, this, this.f55348.getName() + "[" + str + "]", str, Collections.singletonList(this.f32678.resolve(str)), true);
        this.f32679.m44444(c3517);
        return c3517;
    }

    @Override // l.AbstractC16941, l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final void mo4670(Iterable iterable, String str) {
        InterfaceC24329 interfaceC24329M39917 = AbstractC16941.m39917(iterable);
        if (this.f32679 == null) {
            this.f32679 = new C19179(this.f32677);
        }
        C3517 c3517M44442 = this.f32679.m44442(str);
        if (c3517M44442 == null) {
            this.f32679.m44444(new C3517(this.f32677, this, this.f55348.getName() + "[" + str + "]", str, Collections.singletonList(interfaceC24329M39917), true));
        } else {
            c3517M44442.f12094 = Collections.singletonList(interfaceC24329M39917);
            this.f32679.m44449(c3517M44442);
        }
        this.f55346 = true;
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC24928 mo4676(InterfaceC24329 interfaceC24329) {
        C19179 c19179 = this.f32679;
        if (c19179 == null) {
            return null;
        }
        return c19179.m44448(interfaceC24329);
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ܳ */
    public final Iterable mo4673() throws IOException {
        InterfaceC24329 interfaceC24329;
        if (!this.f32680 && (interfaceC24329 = this.f32678) != null) {
            DirectoryStream directoryStreamNewDirectoryStream = C3445.newDirectoryStream(interfaceC24329);
            try {
                Iterator it = directoryStreamNewDirectoryStream.iterator();
                while (it.hasNext()) {
                    mo4668(((InterfaceC24329) it.next()).getFileName().toString());
                }
                directoryStreamNewDirectoryStream.close();
                this.f32680 = true;
            } catch (Throwable th) {
                if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        C19179 c19179 = this.f32679;
        if (c19179 == null || c19179.m44446()) {
            return Collections.EMPTY_SET;
        }
        return Collections.singleton(this.f32679.m44450());
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4672(InterfaceC24329 interfaceC24329) {
        C19179 c19179 = this.f32679;
        if (c19179 != null) {
            return c19179.m44445(interfaceC24329);
        }
        return this.f32678 != null && C22185.m50185(interfaceC24329).startsWith(C22185.m50185(this.f32678));
    }
}
