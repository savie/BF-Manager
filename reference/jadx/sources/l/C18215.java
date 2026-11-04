package l;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܿۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8KC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18215 implements InterfaceC24183 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C2764 f59468 = new C2764(6);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaDrm f59469;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final UUID f59470;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f59471;

    @Override // l.InterfaceC24183
    /* JADX INFO: renamed from: ۙ */
    public final synchronized void mo38096() {
        int i = this.f59471 - 1;
        this.f59471 = i;
        if (i == 0) {
            this.f59469.release();
        }
    }

    @Override // l.InterfaceC24183
    /* JADX INFO: renamed from: ᩸ */
    public final int mo38106() {
        return 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC24183 m42362(UUID uuid) {
        try {
            try {
                try {
                    return new C18215(uuid);
                } catch (Exception e) {
                    throw new C1062(e);
                }
            } catch (UnsupportedSchemeException e2) {
                throw new C1062(e2);
            }
        } catch (C1062 unused) {
            C1896.m6515("Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new C15977();
        }
    }

    public C18215(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = C19158.f61989;
        C20782.m47564("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f59470 = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(C19158.f61986)) ? uuid : uuid2);
        this.f59469 = mediaDrm;
        this.f59471 = 1;
        if (C19158.f61988.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // l.InterfaceC24183
    /* JADX INFO: renamed from: ۙ */
    public final void mo38097(final InterfaceC20453 interfaceC20453) {
        this.f59469.setOnEventListener(new MediaDrm.OnEventListener() { // from class: l.ܰۡۙ
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                C18215 c18215 = this.f45595;
                InterfaceC20453 interfaceC20454 = interfaceC20453;
                c18215.getClass();
                HandlerC0076 handlerC0076 = ((C17975) interfaceC20454).f58905.f22621;
                handlerC0076.getClass();
                handlerC0076.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // l.InterfaceC24183
    /* JADX INFO: renamed from: ۤ */
    public final byte[] mo38102() {
        return this.f59469.openSession();
    }

    @Override // l.InterfaceC24183
    /* JADX INFO: renamed from: ᩸ */
    public final void mo38107(byte[] bArr) {
        this.f59469.closeSession(bArr);
    }

    @Override // l.InterfaceC24183
    /* JADX INFO: renamed from: ۙ */
    public final void mo38098(byte[] bArr, C20738 c20738) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                C21199.m48335(this.f59469, bArr, c20738);
            } catch (UnsupportedOperationException unused) {
                C1896.m6517("setLogSessionId failed.");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0247  */
    /* JADX WARN: Code duplicated, block: B:134:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b2  */
    @Override // l.InterfaceC24183
    /* JADX INFO: renamed from: ۙ */
    public final C3299 mo38095(byte[] bArr, List list, int i, HashMap map) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        int i2;
        C5208 c5208;
        C14739 c14739M48805;
        int i3;
        int i4;
        byte[] bArrM48806;
        C14739 c14739M48806;
        UUID uuid = this.f59470;
        C5208 c5209 = null;
        if (list != null) {
            if (!C19158.f61988.equals(uuid)) {
                c5208 = (C5208) list.get(0);
            } else if (Build.VERSION.SDK_INT < 28 || list.size() <= 1) {
                i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        c5208 = (C5208) list.get(0);
                        break;
                    }
                    C5208 c52010 = (C5208) list.get(i2);
                    byte[] bArr3 = c52010.f18372;
                    bArr3.getClass();
                    c14739M48805 = C21453.m48805(bArr3);
                    if (c14739M48805 == null) {
                        i3 = -1;
                    } else {
                        i3 = c14739M48805.f48154;
                    }
                    i4 = Build.VERSION.SDK_INT;
                    if ((i4 >= 23 && i3 == 0) || (i4 >= 23 && i3 == 1)) {
                        c5208 = c52010;
                        break;
                    }
                }
            } else {
                C5208 c52011 = (C5208) list.get(0);
                int i5 = 0;
                int length = 0;
                while (true) {
                    if (i5 < list.size()) {
                        C5208 c52012 = (C5208) list.get(i5);
                        byte[] bArr4 = c52012.f18372;
                        bArr4.getClass();
                        if (!C17359.equals(c52012.f18370, c52011.f18370) || !C17359.equals(c52012.f18373, c52011.f18373) || C21453.m48805(bArr4) == null) {
                            i2 = 0;
                            while (true) {
                                if (i2 < list.size()) {
                                    c5208 = (C5208) list.get(0);
                                    break;
                                }
                                C5208 c52013 = (C5208) list.get(i2);
                                byte[] bArr5 = c52013.f18372;
                                bArr5.getClass();
                                c14739M48805 = C21453.m48805(bArr5);
                                if (c14739M48805 == null) {
                                    i3 = -1;
                                } else {
                                    i3 = c14739M48805.f48154;
                                }
                                i4 = Build.VERSION.SDK_INT;
                                i2 = i4 >= 23 ? i2 + 1 : i2 + 1;
                                c5208 = c52013;
                                break;
                            }
                        }
                        length += bArr4.length;
                        i5++;
                    } else {
                        byte[] bArr6 = new byte[length];
                        int i6 = 0;
                        for (int i7 = 0; i7 < list.size(); i7++) {
                            byte[] bArr7 = ((C5208) list.get(i7)).f18372;
                            bArr7.getClass();
                            int length2 = bArr7.length;
                            System.arraycopy(bArr7, 0, bArr6, i6, length2);
                            i6 += length2;
                        }
                        c5208 = new C5208(c52011.f18371, c52011.f18373, c52011.f18370, bArr6);
                    }
                }
            }
            byte[] bArrM48807 = c5208.f18372;
            bArrM48807.getClass();
            UUID uuid2 = C19158.f61987;
            if (uuid2.equals(uuid)) {
                byte[] bArrM48808 = C21453.m48806(uuid, bArrM48807);
                if (bArrM48808 != null) {
                    bArrM48807 = bArrM48808;
                }
                C21287 c21287 = new C21287(bArrM48807);
                int iM48483 = c21287.m48483();
                short sM48520 = c21287.m48520();
                short sM48521 = c21287.m48520();
                if (sM48520 == 1 && sM48521 == 1) {
                    short sM48522 = c21287.m48520();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String strM48488 = c21287.m48488(sM48522, charset);
                    if (!strM48488.contains("<LA_URL>")) {
                        int iIndexOf = strM48488.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            C1896.m6517("Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(strM48488.substring(0, iIndexOf));
                        sb.append("<LA_URL>https://x</LA_URL>");
                        String strM = ExternalValue$$ExternalSyntheticOutline0.m(iIndexOf, strM48488, sb);
                        int i8 = iM48483 + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i8);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i8);
                        byteBufferAllocate.putShort(sM48520);
                        byteBufferAllocate.putShort(sM48521);
                        byteBufferAllocate.putShort((short) (strM.length() * 2));
                        byteBufferAllocate.put(strM.getBytes(charset));
                        bArrM48807 = byteBufferAllocate.array();
                    }
                } else {
                    C1896.m6513("Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArrM48807 = C21453.m48807(uuid2, null, bArrM48807);
            }
            int i9 = Build.VERSION.SDK_INT;
            if (i9 < 27 && C17359.equals(uuid, C19158.f61986) && (c14739M48806 = C21453.m48805(bArrM48807)) != null) {
                bArrM48807 = C21453.m48807(C19158.f61989, c14739M48806.f48151, c14739M48806.f48153);
            }
            if (i9 < 23 && C19158.f61988.equals(uuid)) {
                bArrM48806 = C21453.m48806(uuid, bArrM48807);
                if (bArrM48806 != null) {
                    bArrM48807 = bArrM48806;
                }
            } else if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                String str2 = Build.MODEL;
                if ("AFTB".equals(str2) || "AFTS".equals(str2) || "AFTM".equals(str2) || "AFTT".equals(str2)) {
                    bArrM48806 = C21453.m48806(uuid, bArrM48807);
                    if (bArrM48806 != null) {
                        bArrM48807 = bArrM48806;
                    }
                }
            }
            String str3 = c5208.f18370;
            str = (i9 < 26 && C19158.f61986.equals(uuid) && ("video/mp4".equals(str3) || "audio/mp4".equals(str3))) ? "cenc" : str3;
            bArr2 = bArrM48807;
            c5209 = c5208;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f59469.getKeyRequest(bArr, bArr2, str, i, map);
        byte[] data = keyRequest.getData();
        if (C19158.f61986.equals(uuid) && Build.VERSION.SDK_INT < 27) {
            data = C7116.m19481(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            defaultUrl = "";
        } else if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
            String propertyString = this.f59469.getPropertyString("version");
            if (C17359.equals(propertyString, "1.2") || C17359.equals(propertyString, "aidl-1")) {
                defaultUrl = "";
            }
        }
        if (TextUtils.isEmpty(defaultUrl) && c5209 != null) {
            String str4 = c5209.f18373;
            if (!TextUtils.isEmpty(str4)) {
                defaultUrl = str4;
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            keyRequest.getRequestType();
        }
        return new C3299(data, defaultUrl);
    }

    @Override // l.InterfaceC24183
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo38105(byte[] bArr, byte[] bArr2) {
        if (C19158.f61986.equals(this.f59470) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(C7116.m19481(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                C1896.m6516("Failed to adjust response data: ".concat(C7116.m19481(bArr2)), e);
            }
        }
        return this.f59469.provideKeyResponse(bArr, bArr2);
    }

    @Override // l.InterfaceC24183
    /* JADX INFO: renamed from: ᩷ */
    public final C6283 mo38103() {
        MediaDrm.ProvisionRequest provisionRequest = this.f59469.getProvisionRequest();
        return new C6283(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // l.InterfaceC24183
    /* JADX INFO: renamed from: ᩷ */
    public final void mo38104(byte[] bArr) throws DeniedByServerException {
        this.f59469.provideProvisionResponse(bArr);
    }

    @Override // l.InterfaceC24183
    /* JADX INFO: renamed from: ۙ */
    public final Map mo38094(byte[] bArr) {
        return this.f59469.queryKeyStatus(bArr);
    }

    @Override // l.InterfaceC24183
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo38100(String str, byte[] bArr) throws Throwable {
        MediaCrypto mediaCrypto;
        boolean zEquals;
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.f59470;
        if (i >= 31) {
            boolean zEquals2 = uuid.equals(C19158.f61988);
            MediaDrm mediaDrm = this.f59469;
            if (zEquals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                zEquals = uuid.equals(C19158.f61986);
            }
            if (zEquals) {
                return C21199.m48336(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i >= 27 || !C17359.equals(uuid, C19158.f61986)) ? uuid : C19158.f61989, bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
                    mediaCrypto.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto2 = mediaCrypto;
                    boolean z = !uuid.equals(C19158.f61986);
                    if (mediaCrypto2 != null) {
                        mediaCrypto2.release();
                    }
                    return z;
                } catch (Throwable th) {
                    th = th;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (MediaCryptoException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            mediaCrypto = mediaCrypto2;
        }
    }

    @Override // l.InterfaceC24183
    /* JADX INFO: renamed from: ۙ */
    public final void mo38099(byte[] bArr, byte[] bArr2) {
        this.f59469.restoreKeys(bArr, bArr2);
    }

    @Override // l.InterfaceC24183
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC4944 mo38101(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.f59470;
        if (i < 27 && C17359.equals(uuid, C19158.f61986)) {
            uuid = C19158.f61989;
        }
        return new C4045(uuid, bArr);
    }
}
