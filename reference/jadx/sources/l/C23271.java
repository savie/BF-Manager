package l;

import android.webkit.WebSettings;
import android.webkit.WebStorage;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebStorageBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: renamed from: l.᩹ۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9D4 */
/* JADX INFO: loaded from: classes.dex */
public class C23271 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f75417;

    public C23271() {
        this.f75417 = new AtomicInteger(1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23271 m52382() {
        if (((AtomicInteger) this.f75417).getAndIncrement() > 0) {
            return this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m52383() {
        return ((AtomicInteger) this.f75417).decrementAndGet() <= 0;
    }

    public C23271(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f75417 = webkitToCompatConverterBoundaryInterface;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7172 m52381(WebSettings webSettings) {
        return new C7172((WebSettingsBoundaryInterface) C8372.m22531(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) this.f75417).convertSettings(webSettings)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4664 m52380(WebStorage webStorage) {
        return new C4664((WebStorageBoundaryInterface) C8372.m22531(WebStorageBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) this.f75417).convertWebStorage(webStorage)));
    }
}
