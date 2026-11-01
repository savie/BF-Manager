package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.charset.CharacterCodingException;

/* JADX INFO: renamed from: l.᩷ᩴ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: N6WI */
/* JADX INFO: loaded from: classes5.dex */
public final class C21061 implements InterfaceC7034 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f68597;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f68598;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f68599;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f68600;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f68601;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16725[] f68602;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23158 f68603;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String[] f68604;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5518 f68605;

    public C21061(String str, String str2, String[] strArr, C23158 c23158, boolean z, int[] iArr, long j, C16725[] c16725Arr, C5518 c5518) {
        this.f68600 = str2;
        this.f68604 = strArr;
        this.f68603 = c23158;
        this.f68599 = z;
        this.f68597 = iArr;
        this.f68598 = j;
        this.f68602 = c16725Arr;
        this.f68605 = c5518;
        this.f68601 = str;
    }

    @Override // l.InterfaceC7034
    /* JADX INFO: renamed from: ۙ */
    public final void mo2749(C21145 c21145, BufferedOutputStream bufferedOutputStream) throws C12731, IOException {
        C16725[] c16725Arr = this.f68602;
        String strMo33986 = c21145.f68869.mo33986();
        this.f68601 = strMo33986;
        C20356.m45930(strMo33986);
        byte[] bArrM4658 = C1305.m4658(c21145, 524288);
        C20356.m45930(this.f68601);
        try {
            C0496 c0496M40633 = C17430.m40633(this.f68600, bArrM4658);
            String str = c0496M40633.f2184;
            String str2 = c0496M40633.f2183;
            String[] strArr = this.f68604;
            strArr[0] = str2;
            try {
                C6929 c6929M51163 = this.f68603.m51163(str, this.f68599);
                int iM18586 = c6929M51163.m18586();
                int[] iArr = this.f68597;
                iArr[0] = iM18586;
                long j = this.f68598;
                if (j != -1 && j != iM18586) {
                    throw C12731.m31627("FILE_TEXT_REPLACEMENT_COUNT_MISMATCH", "The selected replacement count differs from expectedReplacements. No changes were published.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, this.f68601).add("expectedReplacements", j).add("actualReplacements", iArr[0]));
                }
                if (c6929M51163.m18587().equals(str)) {
                    bufferedOutputStream.write(bArrM4658);
                } else {
                    try {
                        C16725 c16725M40634 = C17430.m40634(10485760, c6929M51163.m18587(), strArr[0]);
                        c16725Arr[0] = c16725M40634;
                        if (!this.f68605.m15221(c16725M40634.f53559)) {
                            throw C20356.m45928("FILE_TEXT_ENCODING_MISMATCH", "The replacement would change the physical BOM. Adjust the pattern or replacement text to preserve it.", this.f68601);
                        }
                        bufferedOutputStream.write(c16725Arr[0].f53559);
                    } catch (CharacterCodingException unused) {
                        throw C20356.m45928("FILE_TEXT_ENCODE_FAILED", "The replacement cannot be represented in the selected encoding.", this.f68601);
                    } catch (C12492 e) {
                        throw C20356.m45932(this.f68601, JSON.value(e.f41783));
                    }
                }
                C20356.m45930(this.f68601);
            } catch (C1284 e2) {
                throw C20356.m45933(e2, this.f68601);
            }
        } catch (CharacterCodingException unused2) {
            throw C20356.m45928("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected encoding.", this.f68601);
        } catch (C20253 unused3) {
            throw C20356.m45928("FILE_TEXT_ENCODING_MISMATCH", "Copy the current file's encoding including its physical BOM.", this.f68601);
        }
    }

    @Override // l.InterfaceC7034
    /* JADX INFO: renamed from: ۙ */
    public final void mo2748() throws C12731 {
        C20356.m45930(this.f68601);
    }
}
