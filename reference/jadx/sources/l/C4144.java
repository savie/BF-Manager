package l;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.alipay.sdk.m.y.l;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۘۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes3.dex */
public final class C4144 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f14048;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f14049;

    public C4144(AbstractC22044 abstractC22044, String str) {
        this.f14049 = abstractC22044;
        this.f14048 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4144)) {
            return false;
        }
        C4144 c4144 = (C4144) obj;
        return C17359.equals(this.f14049, c4144.f14049) && C17359.equals(this.f14048, c4144.f14048);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f14048) + (C17359.hashCode(this.f14049) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f14049, this.f14048};
        String[] strArrSplit = "file;candidatePath".length() == 0 ? new String[0] : "file;candidatePath".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C4144.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m13270() {
        return this.f14048;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m13271() {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        String str = this.f14048;
        if (str != null) {
            AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
            if (abstractC22044M35193.mo4302()) {
                if (Build.VERSION.SDK_INT >= 30) {
                    InterfaceC23405 interfaceC23405M12986 = C4013.m12986();
                    if (!interfaceC23405M12986.mo29539()) {
                        try {
                            if (abstractC22044M35193 instanceof C18379) {
                                final C18379 c18379 = (C18379) abstractC22044M35193;
                                if (interfaceC23405M12986.mo29538()) {
                                    Future futureSubmit = C5261.f18540.submit(new Callable() { // from class: l.᩹ۨᩴ
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            try {
                                                InputStream inputStreamMo4290 = c18379.mo4290();
                                                try {
                                                    Boolean bool = Boolean.TRUE;
                                                    inputStreamMo4290.close();
                                                    return bool;
                                                } catch (Throwable th) {
                                                    try {
                                                        inputStreamMo4290.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception unused) {
                                                return Boolean.FALSE;
                                            }
                                        }
                                    });
                                    try {
                                        if (futureSubmit.get(1L, TimeUnit.SECONDS) == Boolean.TRUE) {
                                            if (!futureSubmit.isDone()) {
                                                futureSubmit.cancel(true);
                                                return abstractC22044M35193;
                                            }
                                        } else if (!futureSubmit.isDone()) {
                                            futureSubmit.cancel(true);
                                        }
                                    } catch (Exception unused) {
                                        if (!futureSubmit.isDone()) {
                                        }
                                    } catch (Throwable th) {
                                        if (!futureSubmit.isDone()) {
                                            futureSubmit.cancel(true);
                                        }
                                        throw th;
                                    }
                                } else if (c18379.mo42886() && (parcelFileDescriptorOpenFileDescriptor = C21576.m49091().openFileDescriptor(c18379.mo42888(), "r")) != null) {
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                    return abstractC22044M35193;
                                }
                            } else if (abstractC22044M35193 instanceof C17063) {
                                ((C17063) abstractC22044M35193).mo4290().close();
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }
                return abstractC22044M35193;
            }
        }
        return this.f14049;
    }
}
