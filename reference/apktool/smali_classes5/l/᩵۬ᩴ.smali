.class public final synthetic Ll/᩵۬ᩴ;
.super Ljava/lang/Object;
.source "HIRF"

# interfaces
.implements Ljava/util/function/IntSupplier;


# instance fields
.field public final synthetic ۙ:Ll/ۨ᩷ܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۨ᩷ܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵۬ᩴ;->ۙ:Ll/ۨ᩷ܳ;

    return-void
.end method


# virtual methods
.method public final getAsInt()I
    .locals 2

    .line 2
    sget v0, Ll/᩸ۙܳ;->ۚۤ:I

    .line 1234
    iget-object v0, p0, Ll/᩵۬ᩴ;->ۙ:Ll/ۨ᩷ܳ;

    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->᩸()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    .line 463
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method
