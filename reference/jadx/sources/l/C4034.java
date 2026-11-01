package l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import bin.mt.plus.R;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۘܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q92M */
/* JADX INFO: loaded from: classes3.dex */
public final class C4034 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C3329 f14910;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C1979 f14911;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C23229 f14912;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f14913;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public CharSequence f14914;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Charset f14915;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f14916;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14393 f14917;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f14918;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f14919;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f14920;

    public C4034(C6111 c6111, C14393 c14393, int[] iArr, ActivityC11632 activityC11632, Charset charset, int i) {
        this.f14918 = c6111;
        this.f14917 = c14393;
        this.f14913 = iArr;
        this.f14920 = activityC11632;
        this.f14915 = charset;
        this.f14916 = i;
        this.f14912 = C23229.m51234(c6111);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C9742 c9742;
        this.f14910 = this.f14918.m17000().mo2398();
        C14393 c14393 = this.f14917;
        if (c14393 != null && (c9742 = c14393.f47155) != null && c9742.m24720() > 1) {
            int[] iArr = this.f14913;
            if (iArr[0] == iArr[1]) {
                this.f14911 = c14393.f47155.m24712(c14393.f47153, this.f14910, c14393.f47165.f5556);
            }
        }
        m10245(this.f14920);
        this.f12806.m40697(new RunnableC1212(0, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11540(C4034 c4034) {
        c4034.f14919 = true;
        c4034.m10251();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        OutputStreamWriter outputStreamWriter;
        int i;
        Charset charset = this.f14915;
        C3329 c3329 = this.f14910;
        try {
            if (this.f14919) {
                throw new CancellationException("Text statistics canceled");
            }
            c3329.m9894(new RunnableC13208(0, this));
            int[] iArr = this.f14913;
            int i2 = iArr[0];
            int length = iArr[1];
            boolean z = i2 != length;
            if (!z) {
                i2 = 0;
            }
            if (!z) {
                length = c3329.length();
            }
            int i3 = length;
            if (this.f14911 == null) {
                this.f14914 = C15325.m36685(c3329, i2, i3, this.f14915, this.f14916, new RunnableC13208(0, this), null, null, true).m51090();
            } else {
                C23086 c23086 = new C23086(0L, 0L, 0L, 0L, 1L, 0);
                C21674 c21674 = new C21674();
                C6857 c6857 = new C6857();
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(c6857, charset);
                C23086 c23086M51091 = c23086;
                int i4 = 0;
                while (i4 < this.f14911.f7421.m24720()) {
                    try {
                        if (this.f14919) {
                            throw new CancellationException("Text statistics canceled");
                        }
                        if (i4 == this.f14911.m6390()) {
                            int i5 = i4;
                            C23086 c23087 = c23086M51091;
                            outputStreamWriter = outputStreamWriter2;
                            try {
                                C23086 c23086M36685 = C15325.m36685(c3329, 0, c3329.length(), this.f14915, this.f14916, new RunnableC13208(0, this), c21674, outputStreamWriter2, true);
                                this.f14914 = c23086M36685.m51090();
                                c23086M51091 = c23087.m51091(c23086M36685);
                                i = i5;
                            } catch (Throwable th) {
                                th = th;
                            }
                        } else {
                            C23086 c23088 = c23086M51091;
                            outputStreamWriter = outputStreamWriter2;
                            i = i4;
                            C3329 c3329M6391 = this.f14911.m6391(i);
                            try {
                                c3329M6391.m9894(new RunnableC13208(0, this));
                                C23086 c23086M51092 = c23088.m51091(C15325.m36685(c3329M6391, 0, c3329M6391.length(), this.f14915, this.f14916, new RunnableC13208(0, this), c21674, outputStreamWriter, false));
                                c3329M6391.close();
                                c23086M51091 = c23086M51092;
                            } catch (Throwable th2) {
                                try {
                                    c3329M6391.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                        i4 = i + 1;
                        outputStreamWriter2 = outputStreamWriter;
                    } catch (Throwable th4) {
                        th = th4;
                        outputStreamWriter = outputStreamWriter2;
                    }
                    Throwable th5 = th;
                    try {
                        outputStreamWriter.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
                C23086 c23089 = c23086M51091;
                outputStreamWriter2.close();
                C23086 c230810 = new C23086(((c23089.f75018 - 1) * ((long) (this.f14916 - "\n".getBytes(charset).length))) + c6857.f23132, c23089.f75022, c21674.m48406(), c23089.f75021, c23089.f75018, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String strM39288 = C16737.m39288(R.string.MT_Protector);
                StyleSpan styleSpan = new StyleSpan(1);
                RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(1.05f);
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) strM39288);
                spannableStringBuilder.setSpan(styleSpan, length2, spannableStringBuilder.length(), 17);
                spannableStringBuilder.setSpan(relativeSizeSpan, length2, spannableStringBuilder.length(), 17);
                spannableStringBuilder.append((CharSequence) "\n").append(this.f14914);
                AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(4, true);
                int length3 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) "\n \n");
                spannableStringBuilder.setSpan(absoluteSizeSpan, length3, spannableStringBuilder.length(), 17);
                String strM39289 = C16737.m39288(R.string.MT_Protector);
                StyleSpan styleSpan2 = new StyleSpan(1);
                RelativeSizeSpan relativeSizeSpan2 = new RelativeSizeSpan(1.05f);
                int length4 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) strM39289);
                spannableStringBuilder.setSpan(styleSpan2, length4, spannableStringBuilder.length(), 17);
                spannableStringBuilder.setSpan(relativeSizeSpan2, length4, spannableStringBuilder.length(), 17);
                spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) c230810.m51090());
                this.f14914 = spannableStringBuilder;
            }
            c3329.close();
        } catch (Throwable th7) {
            if (c3329 == null) {
                throw th7;
            }
            try {
                c3329.close();
                throw th7;
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
                throw th7;
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f14919 || !this.f14912.m51236()) {
            return;
        }
        C8067 c8067BuildDialog = this.f14920.buildDialog();
        int[] iArr = this.f14913;
        c8067BuildDialog.m21274(iArr[0] != iArr[1] ? R.string.MT_Protector : R.string.MT_Protector);
        c8067BuildDialog.m21261(this.f14914);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        C23250.m51307(c8067BuildDialog.m21269());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f14919 || !this.f14912.m51236()) {
            return;
        }
        this.f14920.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C3329 c3329 = this.f14910;
        if (c3329 != null) {
            c3329.close();
        }
        C1979 c1979 = this.f14911;
        if (c1979 != null) {
            c1979.close();
        }
        m10251();
    }
}
