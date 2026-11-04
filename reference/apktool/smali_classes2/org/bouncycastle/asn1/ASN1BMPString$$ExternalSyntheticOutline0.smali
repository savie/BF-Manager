.class public final synthetic Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;
.super Ljava/lang/Object;
.source "ASN1BMPString"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/ۤ֨ܳ;
.implements Ll/᩸ۛܽ;


# instance fields
.field public final synthetic $r8$classId:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->$r8$classId:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۤᩳۙ;Ljava/lang/Exception;)V
    .locals 0

    const/4 p1, 0x2

    .line 0
    iput p1, p0, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->$r8$classId:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۤᩳۙ;ZI)V
    .locals 0

    const/4 p1, 0x1

    .line 0
    iput p1, p0, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->$r8$classId:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static m(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 1
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public accept(Landroid/widget/TextView;)V
    .locals 1

    const-string v0, "0"

    .line 71
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public construct()Ljava/lang/Object;
    .locals 1

    .line 0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget v0, p0, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->$r8$classId:I

    .line 4
    check-cast p1, Ll/ᩴᩳۙ;

    packed-switch v0, :pswitch_data_0

    .line 862
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 551
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
