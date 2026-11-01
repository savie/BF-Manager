package l;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴ᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C19045 extends AbstractC9376 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20456 f61602;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f61603;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C18339 f61604;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC3800 f61605;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19045(C20456 c20456, InterfaceC4290 interfaceC4290, EnumC19730... enumC19730Arr) {
        super(interfaceC4290, enumC19730Arr);
        this.f61602 = c20456;
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4921(EnumC19730 enumC19730, String str) {
        if (!this.f31746.contains(enumC19730)) {
            return false;
        }
        this.f31745 = true;
        this.f61605 = str == null ? null : this.f61602.m46271(str, new String[0]);
        return true;
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۨ */
    public final Collection mo9021() {
        InterfaceC3800 interfaceC3800 = this.f61605;
        if (interfaceC3800 == null) {
            return null;
        }
        return Collections.singleton(interfaceC3800);
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final void mo4918(Iterable iterable) {
        if (iterable == null) {
            this.f61605 = null;
        } else {
            this.f31745 = true;
            this.f61605 = AbstractC9376.m24053(iterable);
        }
        this.f61604 = null;
        this.f61603 = false;
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4290 mo4917(String str) {
        if (this.f61604 == null) {
            this.f61604 = new C18339(this.f61602);
        }
        C11990 c11990M42588 = this.f61604.m42588(str);
        if (c11990M42588 != null) {
            return c11990M42588;
        }
        C11990 c11990 = new C11990(this.f61602, this, this.f31747.getName() + "[" + str + "]", str, Collections.singletonList(this.f61605.resolve(str)), true);
        this.f61604.m42590(c11990);
        return c11990;
    }

    @Override // l.AbstractC9376, l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final void mo4919(Iterable iterable, String str) {
        InterfaceC3800 interfaceC3800M24053 = AbstractC9376.m24053(iterable);
        if (this.f61604 == null) {
            this.f61604 = new C18339(this.f61602);
        }
        C11990 c11990M42588 = this.f61604.m42588(str);
        if (c11990M42588 == null) {
            this.f61604.m42590(new C11990(this.f61602, this, this.f31747.getName() + "[" + str + "]", str, Collections.singletonList(interfaceC3800M24053), true));
        } else {
            c11990M42588.f40189 = Collections.singletonList(interfaceC3800M24053);
            this.f61604.m42595(c11990M42588);
        }
        this.f31745 = true;
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC4290 mo4922(InterfaceC3800 interfaceC3800) {
        C18339 c18339 = this.f61604;
        if (c18339 == null) {
            return null;
        }
        return c18339.m42594(interfaceC3800);
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ᩹ */
    public final Iterable mo4923() throws IOException {
        InterfaceC3800 interfaceC3800;
        if (!this.f61603 && (interfaceC3800 = this.f61605) != null) {
            DirectoryStream directoryStreamNewDirectoryStream = C5212.newDirectoryStream(interfaceC3800);
            try {
                Iterator it = directoryStreamNewDirectoryStream.iterator();
                while (it.hasNext()) {
                    mo4917(((InterfaceC3800) it.next()).getFileName().toString());
                }
                directoryStreamNewDirectoryStream.close();
                this.f61603 = true;
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
        C18339 c18339 = this.f61604;
        if (c18339 == null || c18339.m42592()) {
            return Collections.EMPTY_SET;
        }
        return Collections.singleton(this.f61604.m42587());
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4920(InterfaceC3800 interfaceC3800) {
        C18339 c18339 = this.f61604;
        if (c18339 != null) {
            return c18339.m42591(interfaceC3800);
        }
        return this.f61605 != null && C20456.m46261(interfaceC3800).startsWith(C20456.m46261(this.f61605));
    }
}
