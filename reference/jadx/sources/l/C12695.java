package l;

import com.google.android.material.motion.MotionUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

/* JADX INFO: renamed from: l.۫᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: U7M7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12695 extends AbstractC6344 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f42373;

    public C12695(AbstractC3729 abstractC3729, InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801) {
        super(abstractC3729, interfaceC3800);
        this.f42373 = interfaceC3801;
    }

    public C12695(AbstractC3729 abstractC3729, InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801, int i) {
        super(abstractC3729, interfaceC3800);
        this.f42373 = interfaceC3801;
    }

    @Override // l.InterfaceC3458
    public final String getName() {
        return this.f42373 + MotionUtils.EASING_TYPE_FORMAT_START + this.f21404 + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // l.AbstractC6344
    /* JADX INFO: renamed from: ۙ */
    public final String mo17449(Collection collection) {
        InterfaceC3800 interfaceC3800 = this.f21404;
        return AbstractC6344.m17447(((InterfaceC3800) interfaceC3800.getFileSystem().getRootDirectories().iterator().next()).relativize(interfaceC3800));
    }

    @Override // l.AbstractC6344, l.InterfaceC3458
    public final URI toUri() {
        String string = this.f21404.toString();
        URI uriNormalize = this.f42373.toUri().normalize();
        String str = string.startsWith("/") ? "!" : "!/";
        try {
            return new URI("jar:" + uriNormalize + str + string);
        } catch (URISyntaxException e) {
            throw new C0699(uriNormalize + str + string, e);
        }
    }

    @Override // l.AbstractC6344
    public final String toString() {
        return "JarFileObject[" + this.f42373 + ":" + this.f21404 + "]";
    }

    @Override // l.AbstractC6344
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6344 mo17450(String str) {
        return new C12695(this.f21403, this.f21404.resolveSibling(str), this.f42373);
    }
}
