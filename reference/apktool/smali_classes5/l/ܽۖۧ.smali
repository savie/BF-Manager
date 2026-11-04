.class public final synthetic Ll/ܽۖۧ;
.super Ljava/lang/Object;
.source "V7AT"

# interfaces
.implements Ll/ܰۚ᩷;


# instance fields
.field public final synthetic ۙ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܽۖۧ;->ۙ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۙ(J)J
    .locals 9

    .line 2
    iget-object v0, p0, Ll/ܽۖۧ;->ۙ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/᩹֫᩷;

    .line 218
    iget v1, v0, Ll/᩹֫᩷;->֫:I

    int-to-long v1, v1

    mul-long p1, p1, v1

    const-wide/32 v1, 0xf4240

    div-long v3, p1, v1

    .line 219
    iget-wide p1, v0, Ll/᩹֫᩷;->ܺ:J

    const-wide/16 v0, 0x1

    sub-long v7, p1, v0

    const-wide/16 v5, 0x0

    invoke-static/range {v3 .. v8}, Ll/ۜۨۙ;->ۙ(JJJ)J

    move-result-wide p1

    return-wide p1
.end method
