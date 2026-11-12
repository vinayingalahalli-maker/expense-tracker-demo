/**
 * Available API environments with their base URLs.
 * Use these constants to configure the SDK for different environments (production, staging, etc.).
 */
export enum Environment {
  /** DEFAULT environment base URL */
  DEFAULT = 'https://{{base_url}}',
  /** BASE_URL environment base URL */
  BASE_URL = 'https://{{base_url}}',
}
