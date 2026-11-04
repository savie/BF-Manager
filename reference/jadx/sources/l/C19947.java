package l;

import com.google.android.material.motion.MotionUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

/* JADX INFO: renamed from: l.ᩴܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7M7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19947 extends AbstractC13234 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f64146;

    public C19947(AbstractC24643 abstractC24643, InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210) {
        super(abstractC24643, interfaceC24329);
        this.f64146 = interfaceC243210;
    }

    public C19947(AbstractC24643 abstractC24643, InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210, int i) {
        super(abstractC24643, interfaceC24329);
        this.f64146 = interfaceC243210;
    }

    @Override // l.InterfaceC11501
    public final String getName() {
        return this.f64146 + MotionUtils.EASING_TYPE_FORMAT_START + this.f42299 + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // l.AbstractC13234
    /* JADX INFO: renamed from: ۙ */
    public final String mo32788(Collection collection) {
        InterfaceC24329 interfaceC24329 = this.f42299;
        return AbstractC13234.m32785(((InterfaceC24329) interfaceC24329.getFileSystem().getRootDirectories().iterator().next()).relativize(interfaceC24329));
    }

    @Override // l.AbstractC13234, l.InterfaceC11501
    public final URI toUri() {
        String string = this.f42299.toString();
        URI uriNormalize = this.f64146.toUri().normalize();
        String str = string.startsWith("/") ? "!" : "!/";
        try {
            return new URI("jar:" + uriNormalize + str + string);
        } catch (URISyntaxException e) {
            throw new C10996(uriNormalize + str + string, e);
        }
    }

    @Override // l.AbstractC13234
    public final String toString() {
        return "JarFileObject[" + this.f64146 + ":" + this.f42299 + "]";
    }

    @Override // l.AbstractC13234
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC13234 mo32789(String str) {
        return new C19947(this.f42298, this.f42299.resolveSibling(str), this.f64146);
    }
}
