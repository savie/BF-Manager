package l;

import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜ᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6SD */
/* JADX INFO: loaded from: classes4.dex */
public final class C7459 implements InterfaceC23473 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC2720 f24580;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f24581;

    public C7459(AbstractC2720 abstractC2720) {
        this.f24580 = abstractC2720;
        this.f24581 = "file:".concat(C15022.m36182(C15022.m36179().digest(((C9431) abstractC2720).f30601.mo4294().getBytes(StandardCharsets.UTF_8))));
    }

    @Override // l.InterfaceC23473
    public final C16013 identity() throws IOException {
        AbstractC2720 abstractC2720 = this.f24580;
        AbstractC22044 abstractC22044 = ((C9431) abstractC2720).f30601;
        if ((abstractC22044 instanceof C1161) || ((abstractC22044 instanceof C7302) && C14584.m35205(((C9431) abstractC2720).f30601.mo4294()))) {
            String strM40200 = abstractC22044 instanceof C17063 ? ((C17063) abstractC22044).m40200() : ((C9431) abstractC2720).f30601.mo4294();
            try {
                Map attributes = C3445.readAttributes(C6429.of(strM40200, new String[0]), "unix:dev,ino,size,mode,lastModifiedTime,ctime", new EnumC20599[0]);
                if ((((Number) attributes.get("mode")).intValue() & 61440) != 32768) {
                    return new C16013(this.f24581, "", -1L, false);
                }
                return new C16013(this.f24581, attributes.get("dev") + ":" + attributes.get("ino") + ":" + attributes.get("lastModifiedTime") + ":" + attributes.get("ctime"), ((Number) attributes.get("size")).longValue(), true);
            } catch (UnsupportedOperationException unused) {
                if (Build.VERSION.SDK_INT >= 27) {
                    try {
                        StructStat structStatStat = Os.stat(strM40200);
                        if (!OsConstants.S_ISREG(structStatStat.st_mode)) {
                            return new C16013(this.f24581, "", -1L, false);
                        }
                        return new C16013(this.f24581, structStatStat.st_dev + ":" + structStatStat.st_ino + ":" + structStatStat.st_mtim.tv_sec + ":" + structStatStat.st_mtim.tv_nsec + ":" + structStatStat.st_ctim.tv_sec + ":" + structStatStat.st_ctim.tv_nsec, structStatStat.st_size, true);
                    } catch (ErrnoException e) {
                        throw new IOException("Cannot stat text source", e);
                    }
                }
            }
        }
        return new C16013(this.f24581, "", -1L, false);
    }

    @Override // l.InterfaceC23473
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo5931() {
        return ((C9431) this.f24580).f30601.m49875();
    }
}
