package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.charset.CharacterCodingException;

/* JADX INFO: renamed from: l.ۛ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6WI */
/* JADX INFO: loaded from: classes3.dex */
public final class C6241 implements InterfaceC13258 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21551[] f21184;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f21185;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f21186;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10495 f21187;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f21188;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f21189;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f21190;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1547 f21191;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String[] f21192;

    public C6241(String str, String str2, String[] strArr, C1547 c1547, boolean z, int[] iArr, long j, C21551[] c21551Arr, C10495 c10495) {
        this.f21186 = str2;
        this.f21192 = strArr;
        this.f21191 = c1547;
        this.f21185 = z;
        this.f21190 = iArr;
        this.f21188 = j;
        this.f21184 = c21551Arr;
        this.f21187 = c10495;
        this.f21189 = str;
    }

    @Override // l.InterfaceC13258
    /* JADX INFO: renamed from: ۙ */
    public final void mo969(C12512 c12512, BufferedOutputStream bufferedOutputStream) throws C10186, IOException {
        C21551[] c21551Arr = this.f21184;
        String strMo4294 = c12512.f40175.mo4294();
        this.f21189 = strMo4294;
        C4003.m12963(strMo4294);
        byte[] bArrM45334 = C19665.m45334(c12512, 524288);
        C4003.m12963(this.f21189);
        try {
            C14837 c14837M2891 = C0668.m2891(this.f21186, bArrM45334);
            String str = c14837M2891.f48528;
            String str2 = c14837M2891.f48527;
            String[] strArr = this.f21192;
            strArr[0] = str2;
            try {
                C5276 c5276M5478 = this.f21191.m5478(str, this.f21185);
                int iM15863 = c5276M5478.m15863();
                int[] iArr = this.f21190;
                iArr[0] = iM15863;
                long j = this.f21188;
                if (j != -1 && j != iM15863) {
                    throw C10186.m26302("FILE_TEXT_REPLACEMENT_COUNT_MISMATCH", "The selected replacement count differs from expectedReplacements. No changes were published.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, this.f21189).add("expectedReplacements", j).add("actualReplacements", iArr[0]));
                }
                if (c5276M5478.m15864().equals(str)) {
                    bufferedOutputStream.write(bArrM45334);
                } else {
                    try {
                        C21551 c21551M2892 = C0668.m2892(10485760, c5276M5478.m15864(), strArr[0]);
                        c21551Arr[0] = c21551M2892;
                        if (!this.f21187.m26954(c21551M2892.f68832)) {
                            throw C4003.m12961("FILE_TEXT_ENCODING_MISMATCH", "The replacement would change the physical BOM. Adjust the pattern or replacement text to preserve it.", this.f21189);
                        }
                        bufferedOutputStream.write(c21551Arr[0].f68832);
                    } catch (CharacterCodingException unused) {
                        throw C4003.m12961("FILE_TEXT_ENCODE_FAILED", "The replacement cannot be represented in the selected encoding.", this.f21189);
                    } catch (C18567 e) {
                        throw C4003.m12965(this.f21189, JSON.value(e.f60333));
                    }
                }
                C4003.m12963(this.f21189);
            } catch (C19446 e2) {
                throw C4003.m12966(e2, this.f21189);
            }
        } catch (CharacterCodingException unused2) {
            throw C4003.m12961("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected encoding.", this.f21189);
        } catch (C4397 unused3) {
            throw C4003.m12961("FILE_TEXT_ENCODING_MISMATCH", "Copy the current file's encoding including its physical BOM.", this.f21189);
        }
    }

    @Override // l.InterfaceC13258
    /* JADX INFO: renamed from: ۙ */
    public final void mo968() throws C10186 {
        C4003.m12963(this.f21189);
    }
}
