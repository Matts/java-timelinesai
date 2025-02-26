package io.github.matts.timelinesai.responses;

import io.github.matts.timelinesai.model.api.WhatsappAccountEntry;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WhatsappAccountResponse {
    private List<WhatsappAccountEntry> whatsapp_accounts;
}
