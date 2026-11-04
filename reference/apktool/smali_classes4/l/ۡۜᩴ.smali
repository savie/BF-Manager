.class public final synthetic Ll/ۡۜᩴ;
.super Ljava/lang/Object;
.source "44R4"

# interfaces
.implements Ljava/util/function/IntSupplier;


# instance fields
.field public final synthetic ۙ:Ll/ۨ᩷ܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۨ᩷ܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۜᩴ;->ۙ:Ll/ۨ᩷ܳ;

    return-void
.end method


# virtual methods
.method public final getAsInt()I
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۡۜᩴ;->ۙ:Ll/ۨ᩷ܳ;

    .line 1234
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->᩸()I

    move-result v0

    return v0
.end method
