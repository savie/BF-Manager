package l;

import android.content.Context;
import android.content.pm.PackageManager;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.nio.ByteBuffer;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.۬ܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13217 implements InterfaceC21921, InterfaceC1692, ISequentialOutStream, InterfaceC18848, InterfaceC1118, InterfaceC3485, InterfaceC0380 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43974;

    public /* synthetic */ C13217(Object obj) {
        this.f43974 = obj;
    }

    @Override // l.InterfaceC1692
    public /* synthetic */ void onCanceled() {
    }

    @Override // l.InterfaceC1118
    /* JADX INFO: renamed from: ۙ */
    public String mo4141(C12257 c12257) {
        return (String) this.f43974;
    }

    @Override // l.InterfaceC21921
    /* JADX INFO: renamed from: ۙ */
    public void mo1855(int i) {
        ((C18861) this.f43974).mo21455(i);
    }

    @Override // l.InterfaceC0380
    /* JADX INFO: renamed from: ۙ */
    public void mo1825(Object obj) {
        C23421.m51571((C23421) this.f43974, (Object[]) obj);
    }

    @Override // l.InterfaceC1692
    /* JADX INFO: renamed from: ۙ */
    public void mo3908(String str) {
        ActivityC20293.m45789((ActivityC20293) this.f43974, str);
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public int write(ByteBuffer byteBuffer) throws SevenZipException {
        if (((InterfaceC9868) this.f43974).mo2357()) {
            throw new SevenZipException("Canceled");
        }
        return byteBuffer.remaining();
    }

    @Override // l.InterfaceC3485
    /* JADX INFO: renamed from: ۙ */
    public CharSequence mo4815(C4751 c4751) {
        String string;
        Context context = (Context) this.f43974;
        String string2 = ApplicationC0716.f2992.getString("ais", "");
        if (string2.isEmpty()) {
            return context.getString(R.string.MT_Protector);
        }
        if (string2.equals("com.android.vending")) {
            string = context.getString(R.string.MT_Protector);
        } else {
            PackageManager packageManager = context.getPackageManager();
            try {
                string = packageManager.getApplicationInfo(string2, 0).loadLabel(packageManager).toString();
            } catch (PackageManager.NameNotFoundException unused) {
                return string2;
            }
        }
        return string + " (" + string2 + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // l.InterfaceC18848
    /* JADX INFO: renamed from: ܰ */
    public void mo4355(AbstractC20745 abstractC20745) {
        new DialogInterfaceOnClickListenerC8128((C11545) this.f43974, abstractC20745.mo33986());
    }
}
