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

/* JADX INFO: renamed from: l.ܽᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6SD */
/* JADX INFO: loaded from: classes4.dex */
public final class C16818 implements InterfaceC4076 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC12648 f53826;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f53827;

    public C16818(AbstractC12648 abstractC12648) {
        this.f53826 = abstractC12648;
        this.f53827 = "file:".concat(C22253.m49424(C22253.m49421().digest(((C16881) abstractC12648).f53983.mo33986().getBytes(StandardCharsets.UTF_8))));
    }

    @Override // l.InterfaceC4076
    public final C13250 identity() throws IOException {
        AbstractC12648 abstractC12648 = this.f53826;
        AbstractC20745 abstractC20745 = ((C16881) abstractC12648).f53983;
        if ((abstractC20745 instanceof C15432) || ((abstractC20745 instanceof C14042) && C5553.m15327(((C16881) abstractC12648).f53983.mo33986()))) {
            String strM35232 = abstractC20745 instanceof C14705 ? ((C14705) abstractC20745).m35232() : ((C16881) abstractC12648).f53983.mo33986();
            try {
                Map attributes = C5212.readAttributes(C12974.of(strM35232, new String[0]), "unix:dev,ino,size,mode,lastModifiedTime,ctime", new EnumC22146[0]);
                if ((((Number) attributes.get("mode")).intValue() & 61440) != 32768) {
                    return new C13250(this.f53827, "", -1L, false);
                }
                return new C13250(this.f53827, attributes.get("dev") + ":" + attributes.get("ino") + ":" + attributes.get("lastModifiedTime") + ":" + attributes.get("ctime"), ((Number) attributes.get("size")).longValue(), true);
            } catch (UnsupportedOperationException unused) {
                if (Build.VERSION.SDK_INT >= 27) {
                    try {
                        StructStat structStatStat = Os.stat(strM35232);
                        if (!OsConstants.S_ISREG(structStatStat.st_mode)) {
                            return new C13250(this.f53827, "", -1L, false);
                        }
                        return new C13250(this.f53827, structStatStat.st_dev + ":" + structStatStat.st_ino + ":" + structStatStat.st_mtim.tv_sec + ":" + structStatStat.st_mtim.tv_nsec + ":" + structStatStat.st_ctim.tv_sec + ":" + structStatStat.st_ctim.tv_nsec, structStatStat.st_size, true);
                    } catch (ErrnoException e) {
                        throw new IOException("Cannot stat text source", e);
                    }
                }
            }
        }
        return new C13250(this.f53827, "", -1L, false);
    }

    @Override // l.InterfaceC4076
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo6416() {
        return ((C16881) this.f53826).f53983.m46719();
    }
}
